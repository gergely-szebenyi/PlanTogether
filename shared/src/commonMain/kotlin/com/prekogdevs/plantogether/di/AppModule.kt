package com.prekogdevs.plantogether.di

import com.prekogdevs.plantogether.data.local.datastore.AppPreferences
import com.prekogdevs.plantogether.data.local.datastore.createDataStore
import com.prekogdevs.plantogether.data.local.db.AppDatabase
import com.prekogdevs.plantogether.data.local.db.getDatabaseBuilder
import com.prekogdevs.plantogether.data.repository.FakeCalendarEventRepository
import com.prekogdevs.plantogether.domain.repository.CalendarEventRepository
import org.koin.dsl.module

val appModule =
    module {
        single { getDatabaseBuilder().build() }
        single { get<AppDatabase>().calendarEventDao() }
        single { createDataStore() }
        single { AppPreferences(get()) }
        single<CalendarEventRepository> { FakeCalendarEventRepository() }
    }
