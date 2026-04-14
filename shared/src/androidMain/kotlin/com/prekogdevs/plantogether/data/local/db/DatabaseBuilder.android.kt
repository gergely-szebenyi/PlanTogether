package com.prekogdevs.plantogether.data.local.db

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

private lateinit var appContext: Context

fun initDatabaseContext(context: Context) {
    appContext = context.applicationContext
}

actual fun getDatabaseBuilder(): RoomDatabase.Builder<AppDatabase> =
    Room.databaseBuilder(
        context = appContext,
        klass = AppDatabase::class.java,
        name = "plantogether.db",
    )
