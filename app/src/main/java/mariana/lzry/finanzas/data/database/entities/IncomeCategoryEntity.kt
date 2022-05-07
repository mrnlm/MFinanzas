package mariana.lzry.finanzas.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "categories_table")
data class IncomeCategoryEntity (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id") val id: Int = 0,
    @ColumnInfo(name="title") val title: String,
)