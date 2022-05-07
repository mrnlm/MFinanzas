package mariana.lzry.finanzas.data.database.dao

import androidx.room.Dao
import androidx.room.Query
import mariana.lzry.finanzas.data.database.entities.IncomeEntryEntity

@Dao
interface IncomeEntriesReadingDao {
    @Query("SELECT * FROM income_entries_table ORDER BY id DESC")
    suspend fun getAllIncomeEntries(): List<IncomeEntryEntity>
}