package mariana.lzry.finanzas.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import mariana.lzry.finanzas.data.database.dao.*
import mariana.lzry.finanzas.data.database.entities.IncomeCategoryEntity
import mariana.lzry.finanzas.data.database.entities.IncomeEntryEntity
import mariana.lzry.finanzas.data.database.entities.OutcomeCategoryEntity
import mariana.lzry.finanzas.data.database.entities.OutcomeEntryEntity

@Database(entities = [
    IncomeCategoryEntity::class,
    OutcomeCategoryEntity::class,
    IncomeEntryEntity::class,
    OutcomeEntryEntity::class,
 ], version = 5, exportSchema = false)
abstract class FinanzasDatabase : RoomDatabase() {
    abstract fun getIncomeCategoryDao() : CategoriesDao
    abstract fun insertIncomeEntryDao(): IncomeEntriesWritingDao
    abstract fun getAllIncomeEntriesDao(): IncomeEntriesReadingDao
    abstract fun insertOutcomeEntryDao(): OutcomeEntriesWritingDao
    abstract fun getAllOutcomeEntriesDao(): OutcomeEntriesReadingDao
}