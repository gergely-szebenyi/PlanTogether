package com.prekogdevs.plantogether.data.local.datastore

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.longPreferencesKey
import kotlinx.coroutines.flow.first

class AppPreferences(
    private val dataStore: DataStore<Preferences>
) {
    companion object {
        private val USER_ID_KEY = longPreferencesKey("logged_in_user_id")
    }

    suspend fun getLoggedInUserId(): Long? {
        val preferences = dataStore.data.first()
        return preferences[USER_ID_KEY]
    }

    suspend fun setLoggedInUserId(id: Long?) {
        dataStore.edit { preferences ->
            if (id != null) {
                preferences[USER_ID_KEY] = id
            } else {
                preferences.remove(USER_ID_KEY)
            }
        }
    }
}
