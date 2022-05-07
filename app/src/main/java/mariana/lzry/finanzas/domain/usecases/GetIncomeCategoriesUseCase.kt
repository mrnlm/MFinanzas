package mariana.lzry.finanzas.domain.usecases

import mariana.lzry.finanzas.data.repositories.Repository
import mariana.lzry.finanzas.presentation.model.IncomeCategory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetIncomeCategoriesUseCase @Inject constructor(
    private val repository: Repository
){
    suspend operator fun invoke(): List<IncomeCategory> =
        repository.getAllIncomeCategoriesFromDB()
}
