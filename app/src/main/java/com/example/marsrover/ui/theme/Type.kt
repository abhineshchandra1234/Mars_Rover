package com.example.marsrover.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import com.example.marsrover.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val KanitFont = GoogleFont("Kanit")

val KanitFontFamily = FontFamily(
    Font(googleFont = KanitFont, fontProvider = provider),
    androidx.compose.ui.text.font.Font(resId = R.font.kanit_regular),
    Font(googleFont = KanitFont, fontProvider = provider, weight = FontWeight.Light),
    androidx.compose.ui.text.font.Font(resId = R.font.kanit_light, weight = FontWeight.Light),
    Font(googleFont = KanitFont, fontProvider = provider, weight = FontWeight.Medium),
    androidx.compose.ui.text.font.Font(resId = R.font.kanit_medium, weight = FontWeight.Medium),
    Font(googleFont = KanitFont, fontProvider = provider, weight = FontWeight.SemiBold),
    androidx.compose.ui.text.font.Font(resId = R.font.kanit_semibold, weight = FontWeight.SemiBold),
    Font(googleFont = KanitFont, fontProvider = provider, weight = FontWeight.Bold),
    androidx.compose.ui.text.font.Font(resId = R.font.kanit_bold, weight = FontWeight.Bold)
)

// Set of Material typography styles to start with
val MarsRoverTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = KanitFontFamily,
        fontWeight = FontWeight.Light,
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = 0.sp
    ),
    displayMedium = TextStyle(
        fontFamily = KanitFontFamily,
        fontWeight = FontWeight.Light,
        fontSize = 45.sp,
        lineHeight = 52.sp,
        letterSpacing = 0.sp
    ),
    displaySmall = TextStyle(
        fontFamily = KanitFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp,
        lineHeight = 44.sp,
        letterSpacing = 0.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = KanitFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = KanitFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = KanitFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    titleLarge = TextStyle(
        fontFamily = KanitFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    )
)