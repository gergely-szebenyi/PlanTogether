package com.prekogdevs.plantogether.domain.model

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalTime

data class CalendarEvent(
    val id: Long = 0,
    val title: String,
    val date: LocalDate,
    val startTime: LocalTime,
    val endTime: LocalTime,
    val description: String,
    val imageUrl: String? = null,
    val recurrence: Recurrence = Recurrence.NONE,
    val creatorId: Long = 0,
    val groupId: Long = 0,
)
