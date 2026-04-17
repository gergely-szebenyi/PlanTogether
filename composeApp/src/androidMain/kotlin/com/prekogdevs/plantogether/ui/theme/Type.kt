package com.prekogdevs.plantogether.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.prekogdevs.plantogether.R

val InterFontFamily =
    FontFamily(
        Font(R.font.inter_regular, FontWeight.Normal),
        Font(R.font.inter_medium, FontWeight.Medium),
        Font(R.font.inter_semibold, FontWeight.SemiBold),
        Font(R.font.inter_bold, FontWeight.Bold),
    )

val AppTypography =
    Typography(
        headlineLarge =
            TextStyle(
                fontFamily = InterFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp,
            ),
        titleLarge =
            TextStyle(
                fontFamily = InterFontFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 22.sp,
            ),
        titleMedium =
            TextStyle(
                fontFamily = InterFontFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp,
            ),
        bodyLarge =
            TextStyle(
                fontFamily = InterFontFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
            ),
        bodyMedium =
            TextStyle(
                fontFamily = InterFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
            ),
        labelMedium =
            TextStyle(
                fontFamily = InterFontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 13.sp,
            ),
        labelSmall =
            TextStyle(
                fontFamily = InterFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 13.sp,
            ),
    )
