package mariana.lzry.finanzas.domain.usecases

import mariana.lzry.finanzas.data.repositories.Repository
import mariana.lzry.finanzas.presentation.model.Category
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetCategoriesUseCase @Inject constructor(
    private val repository: Repository
){
    suspend fun invokeForIncome(): List<Category> =
        repository.getAllIncomeCategoriesFromDB()

    suspend fun invokeForOutcome(): List<Category> =
        repository.getAllOutcomeCategoriesFromDB()
}
