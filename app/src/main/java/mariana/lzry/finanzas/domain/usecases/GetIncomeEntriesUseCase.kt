package mariana.lzry.finanzas.domain.usecases

import mariana.lzry.finanzas.data.repositories.Repository
import mariana.lzry.finanzas.presentation.model.IncomeEntry
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetIncomeEntriesUseCase @Inject constructor(
    private val repository: Repository
) {
    suspend operator fun invoke(): List<IncomeEntry> =
        repository.getAllIncomeEntriesFromDB()
}