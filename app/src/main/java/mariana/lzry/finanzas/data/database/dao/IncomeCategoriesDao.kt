package mariana.lzry.finanzas.data.database.dao

import androidx.room.Dao
import androidx.room.Query
import mariana.lzry.finanzas.data.database.entities.IncomeCategoryEntity

@Dao
interface IncomeCategoriesDao {
    @Query("SELECT * FROM categories_table ORDER BY id DESC")
    suspend fun getAllIncomeCategories(): List<IncomeCategoryEntity>
}