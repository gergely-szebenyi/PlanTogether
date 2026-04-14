package com.prekogdevs.plantogether.data.local.db

import androidx.room.Room
import androidx.room.RoomDatabase
import com.prekogdevs.plantogether.data.local.DATABASE_NAME
import com.prekogdevs.plantogether.data.local.appContext

actual fun getDatabaseBuilder(): RoomDatabase.Builder<AppDatabase> =
    Room.databaseBuilder(
        context = appContext,
        klass = AppDatabase::class.java,
        name = DATABASE_NAME,
    )
