package mariana.lzry.finanzas.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "outcome_entries_table")
data class OutcomeEntryEntity (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    val id: Int = 0,
    @ColumnInfo(name="amount")
    val amount: String,
)
