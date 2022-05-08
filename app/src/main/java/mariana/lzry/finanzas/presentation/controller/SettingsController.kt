package mariana.lzry.finanzas.presentation.controller

import kotlinx.coroutines.*
import mariana.lzry.finanzas.domain.usecases.GetCategoriesUseCase
import mariana.lzry.finanzas.presentation.model.Category
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SettingsController @Inject constructor(){

    @Inject
    lateinit var getCategoriesUseCase: GetCategoriesUseCase

    fun getAllIncomeCategories(): List<Category> = runBlocking(Dispatchers.IO) {
        return@runBlocking getCategoriesUseCase.invokeForIncome()
    }

    fun getAllOutcomeCategories(): List<Category> = runBlocking(Dispatchers.IO) {
        return@runBlocking getCategoriesUseCase.invokeForOutcome()
    }
}