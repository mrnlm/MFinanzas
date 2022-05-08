package mariana.lzry.finanzas.presentation.model

import mariana.lzry.finanzas.data.database.entities.OutcomeEntryEntity

data class OutcomeEntry(
    var amount: Double,
    val category: String,
    val date: String,
)

fun OutcomeEntryEntity.mapToDomainModel() = OutcomeEntry(amount, category, date)
fun OutcomeEntry.mapToDatabaseModel() = OutcomeEntryEntity(0, amount, category, date)
