package com.example.list.universities.data.db

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.google.gson.Gson
import com.example.network.network.UniversityItem
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton


private val Context.dataStore by preferencesDataStore("settings")

@Singleton
class DataStoreManager @Inject constructor(@ApplicationContext val appContext: Context) {
    private val dataStore = appContext.dataStore


    suspend fun saveUniversities(universityItem: UniversityItem) {
        dataStore.edit { preferences ->
            preferences[stringPreferencesKey(universityItem.name)] = Gson().toJson(universityItem)
        }
    }

    fun getFavs() = dataStore.data
}