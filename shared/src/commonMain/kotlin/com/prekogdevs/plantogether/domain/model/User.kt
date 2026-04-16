package com.prekogdevs.plantogether.domain.model

data class User(
    val id: Long,
    val name: String,
    val email: String,
    val phone: String,
    val avatarUrl: String?,
)
