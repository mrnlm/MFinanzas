package mariana.lzry.finanzas.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import mariana.lzry.finanzas.data.database.dao.IncomeCategoriesDao
import mariana.lzry.finanzas.data.database.dao.IncomeEntriesReadingDao
import mariana.lzry.finanzas.data.database.dao.IncomeEntriesWritingDao
import mariana.lzry.finanzas.data.database.entities.IncomeCategoryEntity
import mariana.lzry.finanzas.data.database.entities.IncomeEntryEntity

@Database(entities = [
    IncomeCategoryEntity::class,
    IncomeEntryEntity::class,
 ], version = 2, exportSchema = false)
abstract class FinanzasDatabase : RoomDatabase() {
    abstract fun getIncomeCategoryDao() : IncomeCategoriesDao
    abstract fun insertIncomeEntryDao(): IncomeEntriesWritingDao
    abstract fun getAllIncomeEntriesDao(): IncomeEntriesReadingDao
}