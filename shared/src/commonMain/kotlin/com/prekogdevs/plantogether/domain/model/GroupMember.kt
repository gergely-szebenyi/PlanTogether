package com.prekogdevs.plantogether.domain.model

data class GroupMember(
    val groupId: Long,
    val userId: Long,
    val role: GroupRole,
)
