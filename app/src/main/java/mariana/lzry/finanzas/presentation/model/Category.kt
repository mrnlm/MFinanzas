package mariana.lzry.finanzas.presentation.model

import mariana.lzry.finanzas.data.database.entities.IncomeCategoryEntity
import mariana.lzry.finanzas.data.database.entities.OutcomeCategoryEntity

data class Category(
    val title: String,
)

fun IncomeCategoryEntity.toDomain() = Category(title)
fun OutcomeCategoryEntity.toDomain() = Category(title)
