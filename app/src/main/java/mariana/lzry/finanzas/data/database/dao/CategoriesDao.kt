package mariana.lzry.finanzas.data.database.dao

import androidx.room.Dao
import androidx.room.Query
import mariana.lzry.finanzas.data.database.entities.IncomeCategoryEntity
import mariana.lzry.finanzas.data.database.entities.OutcomeCategoryEntity

@Dao
interface CategoriesDao {
    @Query("SELECT * FROM categories_table ORDER BY id DESC")
    suspend fun getAllIncomeCategories(): List<IncomeCategoryEntity>

    @Query("SELECT * FROM outcome_categories_table ORDER BY id DESC")
    suspend fun getAllOutcomeCategories(): List<OutcomeCategoryEntity>
}