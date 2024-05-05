package com.example.list.universities.domain

import com.google.gson.Gson
import com.example.network.network.AppAPis
import com.example.list.universities.data.db.DataStoreManager
import com.example.network.network.UniversityItem
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UniversitiesRepo @Inject constructor(
    private val appAPis: AppAPis,
    private val db: DataStoreManager
) {

    fun loadUniversitiesList() = flow<List<UniversityItem>> {
        emit(appAPis.getUniversitiesList())
    }

    fun getDataFromDB() = flow{
        val arr = arrayListOf<UniversityItem>()
        db.getFavs().collect {
            if (it.asMap().isNotEmpty()) {
                it.asMap().map {
                    val obj = Gson().fromJson(it.value.toString(), UniversityItem::class.java)
                    if (arr.find { i -> i.name == obj.name } == null)
                        arr.add(obj)
                }
                emit(UniversitiesUsecase.DataType.DBData(arr))
            }else emit(UniversitiesUsecase.DataType.NetworkData(listOf()))
        }
    }

}