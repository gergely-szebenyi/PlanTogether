package com.prekogdevs.plantogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.prekogdevs.plantogether.ui.theme.Accent
import com.prekogdevs.plantogether.ui.theme.BackgroundLight
import com.prekogdevs.plantogether.ui.theme.Border
import com.prekogdevs.plantogether.ui.theme.Error
import com.prekogdevs.plantogether.ui.theme.OnPrimary
import com.prekogdevs.plantogether.ui.theme.Placeholder
import com.prekogdevs.plantogether.ui.theme.PrimaryDark
import com.prekogdevs.plantogether.ui.theme.PrimaryMedium
import com.prekogdevs.plantogether.ui.theme.TextMuted
import com.prekogdevs.plantogether.ui.theme.TextPrimary
import com.prekogdevs.plantogether.ui.theme.PlanTogetherTheme
import com.prekogdevs.plantogether.ui.theme.TextSecondary

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            PlanTogetherTheme {
                ThemeSample()
            }
        }
    }
}

// Remove later
@Composable
private fun ThemeSample() {
    val colors =
        listOf(
            "Primary Dark" to PrimaryDark,
            "Primary Medium" to PrimaryMedium,
            "Accent" to Accent,
            "Background" to BackgroundLight,
            "Text Primary" to TextPrimary,
            "Text Secondary" to TextSecondary,
            "Text Muted" to TextMuted,
            "Placeholder" to Placeholder,
            "Border" to Border,
            "Error" to Error,
        )

    Column(
        modifier =
            Modifier
                .fillMaxSize()
                .background(BackgroundLight)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        colors.forEach { (name, color) ->
            ThemeItem(name = name, color = color)
        }
    }
}

// Remove later
@Composable
private fun ThemeItem(
    name: String,
    color: Color,
) {
    Box(
        modifier =
            Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(color),
        contentAlignment = Alignment.CenterStart,
    ) {
        Text(
            text = name,
            color = if (color == BackgroundLight || color == Border || color == Placeholder) TextPrimary else OnPrimary,
            modifier = Modifier.padding(start = 16.dp),
        )
    }
}
