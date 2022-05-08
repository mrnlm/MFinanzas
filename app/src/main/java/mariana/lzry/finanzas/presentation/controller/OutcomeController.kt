package mariana.lzry.finanzas.presentation.controller

import android.text.Editable
import android.text.TextWatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import mariana.lzry.finanzas.domain.usecases.GetCategoriesUseCase
import mariana.lzry.finanzas.domain.usecases.WriteOutcomeEntryUseCase
import mariana.lzry.finanzas.presentation.model.Category
import mariana.lzry.finanzas.presentation.model.OutcomeEntry
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class OutcomeController @Inject constructor() {

    @Inject
    lateinit var getCategoriesUseCase: GetCategoriesUseCase
    @Inject
    lateinit var writeOutcomeEntryUseCase: WriteOutcomeEntryUseCase

    private var categories: List<Category>? = null
    private var selectedCategory: Category? = null
    private var amount: Double = 0.0

    fun getAllCategories(): List<Category> = runBlocking(Dispatchers.IO) {
        categories = getCategoriesUseCase.invokeForOutcome()
        return@runBlocking getCategoriesUseCase.invokeForOutcome()
    }

    fun selectOutcomeCategory(spinnerSelection: Int){
        selectedCategory = categories?.get(spinnerSelection)
    }

    var textWatcher: TextWatcher = object : TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            val amountString = if(p0.isNullOrEmpty()){"0.0"} else p0
            amount = amountString.toString().toDouble()
            android.util.Log.d("Mariana debug", "" + amount)
        }

        override fun afterTextChanged(p0: Editable?) {}
    }

    fun verifyAmountSet(): Boolean {
        val validationResult = amount != 0.0
        if (validationResult) {
            val outcomeEntry = OutcomeEntry(amount)
            callWriteOutcomeEntryUseCase(outcomeEntry)
        }
        return validationResult
    }

    private fun callWriteOutcomeEntryUseCase(outcomeEntry: OutcomeEntry) =
        runBlocking(Dispatchers.IO) {
            writeOutcomeEntryUseCase.invoke(outcomeEntry)
        }
}
