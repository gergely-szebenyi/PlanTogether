package com.prekogdevs.plantogether.domain.repository

import com.prekogdevs.plantogether.domain.model.CalendarEvent
import kotlinx.coroutines.flow.Flow
import kotlinx.datetime.LocalDate

interface CalendarEventRepository {
    fun getEventsByDate(date: LocalDate): Flow<List<CalendarEvent>>

    suspend fun getEventById(id: Long): CalendarEvent

    suspend fun insert(event: CalendarEvent): Long

    suspend fun update(event: CalendarEvent)

    suspend fun delete(event: CalendarEvent)
}
