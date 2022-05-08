package mariana.lzry.finanzas.domain.model

import mariana.lzry.finanzas.presentation.model.Category

data class IncomeCategoryModel (
    val id: Int,
    val title: String,
)

fun IncomeCategoryModel.toDomain() = Category(title)