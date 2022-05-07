package mariana.lzry.finanzas.presentation.controller

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import mariana.lzry.finanzas.domain.usecases.GetIncomeEntriesUseCase
import mariana.lzry.finanzas.presentation.model.IncomeEntry
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DetailsController @Inject constructor(){

    @Inject
    lateinit var getIncomeEntriesUseCase: GetIncomeEntriesUseCase

    fun getAllIncomeEntries(): List<IncomeEntry> = runBlocking(Dispatchers.IO) {
        return@runBlocking getIncomeEntriesUseCase.invoke()
    }

}