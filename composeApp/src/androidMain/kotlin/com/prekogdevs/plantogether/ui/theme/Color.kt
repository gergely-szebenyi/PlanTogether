package com.prekogdevs.plantogether.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.core.graphics.toColorInt

fun String.toColor() = Color("#$this".toColorInt())

val PrimaryDark = AppColors.PRIMARY_DARK.toColor()
val PrimaryMedium = AppColors.PRIMARY_MEDIUM.toColor()
val Accent = AppColors.ACCENT.toColor()
val BackgroundLight = AppColors.BACKGROUND.toColor()
val SurfaceLight = AppColors.SURFACE.toColor()
val TextPrimary = AppColors.TEXT_PRIMARY.toColor()
val TextSecondary = AppColors.TEXT_SECONDARY.toColor()
val TextMuted = AppColors.TEXT_MUTED.toColor()
val Placeholder = AppColors.PLACEHOLDER.toColor()
val Border = AppColors.BORDER.toColor()
val Error = AppColors.ERROR.toColor()
val OnPrimary = AppColors.ON_PRIMARY.toColor()
