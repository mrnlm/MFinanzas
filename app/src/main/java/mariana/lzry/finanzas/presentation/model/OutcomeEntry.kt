package mariana.lzry.finanzas.presentation.model

import mariana.lzry.finanzas.data.database.entities.OutcomeEntryEntity

data class OutcomeEntry(
    var amount: Double
)

fun OutcomeEntryEntity.mapToDomainModel() = OutcomeEntry(amount)
fun OutcomeEntry.mapToDatabaseModel() = OutcomeEntryEntity(0, amount)
