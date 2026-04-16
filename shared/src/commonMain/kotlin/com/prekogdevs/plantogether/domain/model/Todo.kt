package com.prekogdevs.plantogether.domain.model

import kotlinx.datetime.LocalDateTime

data class Todo(
    val id: Long,
    val title: String,
    val description: String,
    val priority: Priority,
    val dueDateTime: LocalDateTime?,
    val isCompleted: Boolean,
    val creatorId: Long,
    val assigneeId: Long?,
    val groupId: Long,
)
