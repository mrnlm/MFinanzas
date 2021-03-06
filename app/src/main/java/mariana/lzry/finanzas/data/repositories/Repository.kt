package mariana.lzry.finanzas.data.repositories

import mariana.lzry.finanzas.data.database.dao.*
import mariana.lzry.finanzas.data.database.entities.IncomeCategoryEntity
import mariana.lzry.finanzas.data.database.entities.IncomeEntryEntity
import mariana.lzry.finanzas.data.database.entities.OutcomeCategoryEntity
import mariana.lzry.finanzas.data.database.entities.OutcomeEntryEntity
import mariana.lzry.finanzas.presentation.model.*
import javax.inject.Inject

class Repository @Inject constructor(
    private val categoriesDao: CategoriesDao,
    private val incomeEntriesWritingDao: IncomeEntriesWritingDao,
    private val incomeEntriesReadingDao: IncomeEntriesReadingDao,
    private val outcomeEntriesWritingDao: OutcomeEntriesWritingDao,
    private val outcomeEntriesReadingDao : OutcomeEntriesReadingDao,
) {
    suspend fun getAllIncomeCategoriesFromDB(): List<Category> {
        val response: List<IncomeCategoryEntity> = categoriesDao.getAllIncomeCategories()
        return response.map { it.toDomain() }
    }

    suspend fun getAllOutcomeCategoriesFromDB(): List<Category> {
        val response: List<OutcomeCategoryEntity> = categoriesDao.getAllOutcomeCategories()
        return response.map {it.toDomain()}
    }

    suspend fun insertIncomeEntryIntoDB(incomeEntry: IncomeEntry) {
        incomeEntriesWritingDao.insertIncomeEntry(incomeEntry.toDatabase())
    }

    suspend fun getAllIncomeEntriesFromDB(): List<IncomeEntry> {
        val response: List<IncomeEntryEntity> = incomeEntriesReadingDao.getAllIncomeEntries()
        return response.map { it.toDomain() }
    }

    suspend fun insertOutcomeEntryIntoDB(outcomeEntry: OutcomeEntry) {
        outcomeEntriesWritingDao.insertOutcomeEntry(outcomeEntry.mapToDatabaseModel())
    }

    suspend fun getAllOutcomeEntriesFromDB(): List<OutcomeEntry> {
        val response: List<OutcomeEntryEntity> = outcomeEntriesReadingDao.getAllOutcomeEntries()
        return response.map { it.mapToDomainModel() }
    }
}