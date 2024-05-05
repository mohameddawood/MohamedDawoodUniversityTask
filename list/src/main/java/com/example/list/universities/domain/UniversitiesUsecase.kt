package com.example.list.universities.domain

import androidx.compose.runtime.mutableStateOf
import com.example.network.network.UniversityItem
import javax.inject.Inject

class UniversitiesUsecase @Inject constructor(
    private val repo: UniversitiesRepo
) {
    val showEmptyFav = mutableStateOf(false)
    fun loadUniversities() = (repo.loadUniversitiesList())

    suspend fun getListFromDB() = repo.getDataFromDB()



    sealed class DataType {
        data class DBData(val list: List<UniversityItem>) : DataType()
        data class NetworkData(val list: List<UniversityItem>) : DataType()
    }
}