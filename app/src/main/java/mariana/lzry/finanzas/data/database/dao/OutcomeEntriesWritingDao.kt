package mariana.lzry.finanzas.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import mariana.lzry.finanzas.data.database.entities.OutcomeEntryEntity

@Dao
interface OutcomeEntriesWritingDao {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOutcomeEntry(outcomeEntryEntity: OutcomeEntryEntity)
}
