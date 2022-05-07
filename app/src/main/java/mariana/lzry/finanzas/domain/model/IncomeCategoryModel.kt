package mariana.lzry.finanzas.domain.model

import mariana.lzry.finanzas.presentation.model.IncomeCategory

data class IncomeCategoryModel (
    val id: Int,
    val title: String,
)

fun IncomeCategoryModel.toDomain() = IncomeCategory(title)