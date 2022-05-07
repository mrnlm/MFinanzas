package mariana.lzry.finanzas.data.repositories

import mariana.lzry.finanzas.data.database.dao.IncomeCategoriesDao
import mariana.lzry.finanzas.data.database.dao.IncomeEntriesReadingDao
import mariana.lzry.finanzas.data.database.dao.IncomeEntriesWritingDao
import mariana.lzry.finanzas.data.database.entities.IncomeCategoryEntity
import mariana.lzry.finanzas.data.database.entities.IncomeEntryEntity
import mariana.lzry.finanzas.domain.model.IncomeCategoryModel
import mariana.lzry.finanzas.presentation.model.IncomeCategory
import mariana.lzry.finanzas.presentation.model.IncomeEntry
import mariana.lzry.finanzas.presentation.model.toDatabase
import mariana.lzry.finanzas.presentation.model.toDomain
import javax.inject.Inject

class Repository @Inject constructor(
    private val incomeCategoriesDao: IncomeCategoriesDao,
    private val incomeEntriesWritingDao: IncomeEntriesWritingDao,
    private val incomeEntriesReadingDao: IncomeEntriesReadingDao
) {
    suspend fun getAllIncomeCategoriesFromDB(): List<IncomeCategory> {
        val response: List<IncomeCategoryEntity> = incomeCategoriesDao.getAllIncomeCategories()
        return response.map { it.toDomain() }
    }

    suspend fun insertIncomeEntryIntoDB(incomeEntry: IncomeEntry){
        incomeEntriesWritingDao.insertIncomeEntry(incomeEntry.toDatabase())
    }

    suspend fun getAllIncomeEntriesFromDB(): List<IncomeEntry> {
        val response: List<IncomeEntryEntity> = incomeEntriesReadingDao.getAllIncomeEntries()
        return response.map { it.toDomain() }
    }
}