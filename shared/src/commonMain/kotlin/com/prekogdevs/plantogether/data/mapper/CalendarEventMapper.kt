package com.prekogdevs.plantogether.data.mapper

import com.prekogdevs.plantogether.data.local.entity.CalendarEventEntity
import com.prekogdevs.plantogether.domain.model.CalendarEvent
import com.prekogdevs.plantogether.domain.model.Recurrence

fun CalendarEventEntity.toDomain(): CalendarEvent =
    CalendarEvent(
        id = id,
        title = title,
        date = date,
        startTime = startTime,
        endTime = endTime,
        description = description,
        imageUrl = imageUrl,
        recurrence = Recurrence.valueOf(recurrence),
        creatorId = creatorId,
        groupId = groupId,
    )

fun CalendarEvent.toEntity(): CalendarEventEntity =
    CalendarEventEntity(
        id = id,
        title = title,
        date = date,
        startTime = startTime,
        endTime = endTime,
        description = description,
        imageUrl = imageUrl,
        recurrence = recurrence.name,
        creatorId = creatorId,
        groupId = groupId,
    )
