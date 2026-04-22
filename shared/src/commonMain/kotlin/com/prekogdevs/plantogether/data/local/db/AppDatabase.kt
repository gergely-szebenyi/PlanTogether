package com.prekogdevs.plantogether.data.local.db

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.RoomDatabaseConstructor
import androidx.room.TypeConverters
import com.prekogdevs.plantogether.data.local.converter.DateTimeConverters
import com.prekogdevs.plantogether.data.local.dao.CalendarEventDao
import com.prekogdevs.plantogether.data.local.entity.CalendarEventEntity

@Database(
    entities = [CalendarEventEntity::class],
    version = 1
)
@TypeConverters(DateTimeConverters::class)
@ConstructedBy(AppDatabaseConstructor::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun calendarEventDao(): CalendarEventDao
}

@Suppress("NO_ACTUAL_FOR_EXPECT", "EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect object AppDatabaseConstructor : RoomDatabaseConstructor<AppDatabase> {
    override fun initialize(): AppDatabase
}
