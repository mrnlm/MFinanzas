package mariana.lzry.finanzas.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import mariana.lzry.finanzas.data.database.entities.IncomeEntryEntity

@Dao
interface IncomeEntriesWritingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertIncomeEntry(incomeEntryEntity: IncomeEntryEntity)
}