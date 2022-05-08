package mariana.lzry.finanzas.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="income_entries_table")
data class IncomeEntryEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    val id: Int = 0,
    @ColumnInfo(name="amount")
    val amount: Double,
    @ColumnInfo(name="category")
    val category: String,
    @ColumnInfo(name="date")
    val date: String,
)
