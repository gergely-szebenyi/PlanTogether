package com.prekogdevs.plantogether.domain.model

import kotlinx.datetime.LocalDate

data class Group(
    val id: Long,
    val name: String,
    val createdAt: LocalDate,
    val inviteCode: String?
)
