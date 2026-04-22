package com.prekogdevs.plantogether.data.repository

import com.prekogdevs.plantogether.domain.model.CalendarEvent
import com.prekogdevs.plantogether.domain.model.Recurrence
import com.prekogdevs.plantogether.domain.repository.CalendarEventRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.update
import kotlinx.datetime.DateTimeUnit
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.plus
import kotlinx.datetime.todayIn
import kotlin.time.Clock

private fun createDummyEvents(): List<CalendarEvent> {
    val today = Clock.System.todayIn(TimeZone.currentSystemDefault())

    return listOf(
        CalendarEvent(
            id = 1,
            title = "Csapatmegbeszélés",
            date = today,
            startTime = LocalTime(9, 0),
            endTime = LocalTime(10, 0),
            description = "Heti standup",
            imageUrl = null,
            recurrence = Recurrence.WEEKLY,
            creatorId = 1,
            groupId = 1
        ),
        CalendarEvent(
            id = 2,
            title = "Edzés",
            date = today,
            startTime = LocalTime(17, 0),
            endTime = LocalTime(18, 30),
            description = "Konditerem",
            imageUrl = null,
            recurrence = Recurrence.NONE,
            creatorId = 1,
            groupId = 1
        ),
        CalendarEvent(
            id = 3,
            title = "Projekt bemutató",
            date = today.plus(1, DateTimeUnit.DAY),
            startTime = LocalTime(14, 0),
            endTime = LocalTime(15, 30),
            description = "PlanTogether demó",
            imageUrl = null,
            recurrence = Recurrence.NONE,
            creatorId = 2,
            groupId = 1
        ),
        CalendarEvent(
            id = 4,
            title = "Ebéd Marcival",
            date = today.plus(2, DateTimeUnit.DAY),
            startTime = LocalTime(12, 0),
            endTime = LocalTime(13, 0),
            description = "",
            imageUrl = null,
            recurrence = Recurrence.NONE,
            creatorId = 1,
            groupId = 1
        )
    )
}

class FakeCalendarEventRepository : CalendarEventRepository {

    private val events = MutableStateFlow(createDummyEvents())

    override fun getEventsByDate(date: LocalDate): Flow<List<CalendarEvent>> {
        return events.map { events -> events.filter { it.date == date } }
    }

    override suspend fun getEventById(id: Long): CalendarEvent {
        return events.value.first { event -> event.id == id }
    }

    override suspend fun insert(event: CalendarEvent): Long {
        val newEventId = (events.value.maxOfOrNull { it.id } ?: 0) + 1
        val newEvent = event.copy(id = newEventId)
        events.update { it + newEvent }
        return newEventId
    }

    override suspend fun update(event: CalendarEvent) {
        events.update { events ->
            events.map { calendarEvent ->
                if (calendarEvent.id == event.id) event else calendarEvent
            }
        }
    }

    override suspend fun delete(event: CalendarEvent) {
        events.update { list ->
            list.filter { it.id != event.id }
        }
    }
}
