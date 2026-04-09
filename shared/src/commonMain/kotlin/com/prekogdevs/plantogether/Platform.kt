package com.prekogdevs.plantogether

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
