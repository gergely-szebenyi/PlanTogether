package com.prekogdevs.plantogether.domain.model

import kotlinx.datetime.LocalDateTime

data class Notification(
    val id: Long,
    val type: NotificationType,
    val title: String,
    val message: String,
    val createdAt: LocalDateTime,
    val isRead: Boolean,
    val userId: Long
)
