package com.prekogdevs.plantogether.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme =
    lightColorScheme(
        primary = PrimaryDark,
        secondary = PrimaryMedium,
        tertiary = Accent,
        background = BackgroundLight,
        surface = SurfaceLight,
        error = Error,
        onPrimary = OnPrimary,
        onSecondary = OnPrimary,
        onTertiary = TextPrimary,
        onBackground = TextPrimary,
        onSurface = TextPrimary,
        outline = Border
    )

@Composable
fun PlanTogetherTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = AppTypography,
        content = content
    )
}
