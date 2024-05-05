package com.example.list.universities.presentation

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.list.universities.data.db.DataStoreManager
import com.example.network.network.UniversityItem
import com.example.list.universities.domain.UniversitiesUsecase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


@HiltViewModel
class UniversityViewModel @Inject constructor(
    private val usecase: UniversitiesUsecase,
    private val db: DataStoreManager
) : ViewModel() {
    private var _universities = mutableStateListOf<UniversityItem>()
    val tempList = mutableStateListOf<UniversityItem>()
    val universities: List<UniversityItem> get() = _universities


    fun getEmptyState() = usecase.showEmptyFav

    private fun getUniversitiesList() {
        if (_universities.isEmpty())
            viewModelScope.launch(Dispatchers.IO) {
                usecase.loadUniversities().collect {
                    val items = it.sortedBy { it.name }
                    withContext(Dispatchers.Main) {
                        _universities.addAll(items)
                        tempList.addAll(items)
                    }
                    items.forEach {
                        db.saveUniversities(it)
                    }

                }.runCatching {
                    this.toString()
                }
            }
    }

    fun loadItems() {
        viewModelScope.launch(Dispatchers.IO) {
            usecase.getListFromDB().collect {
                when (it) {
                    is UniversitiesUsecase.DataType.DBData -> {
                        _universities.addAll(it.list)
                        tempList.addAll(it.list)
                        cancel()
                    }

                    is UniversitiesUsecase.DataType.NetworkData -> {
                        getUniversitiesList()
                        cancel()
                    }
                }
            }
        }
    }

}