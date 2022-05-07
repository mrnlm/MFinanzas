package mariana.lzry.finanzas.presentation.controller

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import mariana.lzry.finanzas.domain.usecases.GetIncomeCategoriesUseCase
import mariana.lzry.finanzas.presentation.model.IncomeCategory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SettingsController @Inject constructor(){

    @Inject
    lateinit var getIncomeCategoriesUseCase: GetIncomeCategoriesUseCase

    fun getAllCategories(): List<IncomeCategory> = runBlocking(Dispatchers.IO) {
        return@runBlocking getIncomeCategoriesUseCase.invoke()
    }
}