package mariana.lzry.finanzas.presentation.controller

import android.text.Editable
import android.text.TextWatcher
import kotlinx.coroutines.*
import mariana.lzry.finanzas.domain.usecases.GetCategoriesUseCase
import mariana.lzry.finanzas.domain.usecases.WriteIncomeEntriesUseCase
import mariana.lzry.finanzas.presentation.model.Category
import mariana.lzry.finanzas.presentation.model.IncomeEntry
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class IncomeController @Inject constructor(){

    @Inject
    lateinit var getCategoriesUseCase: GetCategoriesUseCase
    @Inject
    lateinit var writeIncomeEntriesUseCase: WriteIncomeEntriesUseCase

    private var selectedCategory: Category? = null
    private var amount: Double = 0.0
    private var categories: List<Category>? = null

    fun getAllCategories(): List<Category> = runBlocking(Dispatchers.IO) {
        categories = getCategoriesUseCase.invokeForIncome()
        return@runBlocking getCategoriesUseCase.invokeForIncome()
    }

    fun selectIncomeCategory(spinnerSelection: Int){
        selectedCategory = categories?.get(spinnerSelection)
        android.util.Log.d("MarianaDebug",
            "title = "+ selectedCategory?.title)
    }

    var textWatcher: TextWatcher = object: TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            val amountString = if(p0.isNullOrEmpty()){"0.0"} else p0
            amount = amountString.toString().toDouble()
        }

        override fun afterTextChanged(p0: Editable?) {}
    }

    fun verifyAmountAndCategoryAreSet(): Boolean{
        val dateNow: LocalDateTime = LocalDateTime.now()
        val date = DateTimeFormatter
            .ofPattern("dd-MM-yy HH:mm:ss")
            .format(dateNow)
        val validationResult = selectedCategory!=null && amount!=0.0
        if(validationResult){
            val incomeEntry = IncomeEntry(amount, selectedCategory!!.title, date)
            callWriteIncomeEntryUseCase(incomeEntry)
            amount = 0.0
        }
        return validationResult
    }

    private fun callWriteIncomeEntryUseCase(incomeEntry: IncomeEntry) =
        runBlocking(Dispatchers.IO) {
        writeIncomeEntriesUseCase.invoke(incomeEntry)
    }

}