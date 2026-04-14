package com.prekogdevs.plantogether.data.local.datastore

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.Preferences
import com.prekogdevs.plantogether.data.local.DATASTORE_FILE_NAME
import com.prekogdevs.plantogether.data.local.appContext
import okio.Path.Companion.toPath

actual fun createDataStore(): DataStore<Preferences> =
    PreferenceDataStoreFactory.createWithPath {
        appContext.filesDir
            .resolve(DATASTORE_FILE_NAME)
            .absolutePath
            .toPath()
    }
