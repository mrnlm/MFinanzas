package mariana.lzry.finanzas.data.database.dao

import androidx.room.Dao
import androidx.room.Query
import mariana.lzry.finanzas.data.database.entities.OutcomeEntryEntity

@Dao
interface OutcomeEntriesReadingDao {
    @Query("SELECT * FROM outcome_entries_table ORDER BY id DESC")
    suspend fun getAllOutcomeEntries(): List<OutcomeEntryEntity>
}
