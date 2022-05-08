package mariana.lzry.finanzas.presentation.controller

import android.text.Editable
import android.text.TextWatcher
import kotlinx.coroutines.*
import mariana.lzry.finanzas.domain.usecases.GetIncomeCategoriesUseCase
import mariana.lzry.finanzas.domain.usecases.WriteIncomeEntriesUseCase
import mariana.lzry.finanzas.presentation.model.IncomeCategory
import mariana.lzry.finanzas.presentation.model.IncomeEntry
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class IncomeController @Inject constructor(){

    @Inject
    lateinit var getIncomeCategoriesUseCase: GetIncomeCategoriesUseCase
    @Inject
    lateinit var writeIncomeEntriesUseCase: WriteIncomeEntriesUseCase

    private var selectedIncomeCategory: IncomeCategory? = null
    private var amount: String? = null
    private var incomeCategories: List<IncomeCategory>? = null

    fun getAllCategories(): List<IncomeCategory> = runBlocking(Dispatchers.IO) {
        incomeCategories = getIncomeCategoriesUseCase.invoke()
        return@runBlocking getIncomeCategoriesUseCase.invoke()
    }

    fun selectIncomeCategory(spinnerSelection: Int){
        selectedIncomeCategory = incomeCategories?.get(spinnerSelection)
        android.util.Log.d("MarianaDebug",
            "title = "+ selectedIncomeCategory?.title)
    }

    var textWatcher: TextWatcher = object: TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            amount = p0.toString()
        }

        override fun afterTextChanged(p0: Editable?) {}
    }

    //var onSaveIncomeClickListener

    fun verifyAmountAndCategoryAreSet(): Boolean{
        val validationResult = selectedIncomeCategory!=null && !amount.isNullOrEmpty()
        if(validationResult){
            val incomeEntry = IncomeEntry(
                amount!!,
                selectedIncomeCategory!!.title
            )
            callWriteIncomeEntryUseCase(incomeEntry)
        }
        return validationResult
    }

    private fun callWriteIncomeEntryUseCase(incomeEntry: IncomeEntry) = runBlocking(Dispatchers.IO) {
        writeIncomeEntriesUseCase.invoke(incomeEntry)
    }

}