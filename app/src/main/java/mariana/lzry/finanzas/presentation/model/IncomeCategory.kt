package mariana.lzry.finanzas.presentation.model

import mariana.lzry.finanzas.data.database.entities.IncomeCategoryEntity

data class IncomeCategory(
    val title: String,
)

fun IncomeCategoryEntity.toDomain() = IncomeCategory(title)
