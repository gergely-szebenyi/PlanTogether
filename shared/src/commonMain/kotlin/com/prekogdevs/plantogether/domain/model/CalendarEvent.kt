package com.prekogdevs.plantogether.domain.model

import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalTime

data class CalendarEvent(
    val id: Long,
    val title: String,
    val date: LocalDate,
    val startTime: LocalTime,
    val endTime: LocalTime,
    val description: String,
    val imageUrl: String?,
    val recurrence: Recurrence,
    val creatorId: Long,
    val groupId: Long,
)
