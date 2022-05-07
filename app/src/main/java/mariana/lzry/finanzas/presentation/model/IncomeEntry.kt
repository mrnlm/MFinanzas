package mariana.lzry.finanzas.presentation.model

import mariana.lzry.finanzas.data.database.entities.IncomeEntryEntity

data class IncomeEntry (
    val amount: String,
    val category: String,
)

fun IncomeEntryEntity.toDomain() = IncomeEntry(amount, category)
fun IncomeEntry.toDatabase() = IncomeEntryEntity(0, amount, category)