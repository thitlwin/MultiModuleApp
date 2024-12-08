package com.thit.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.thit.ui.theme.YawKiShape
import com.thit.ui.theme.backgroundDark
import com.thit.ui.theme.backgroundDarkHighContrast
import com.thit.ui.theme.backgroundDarkMediumContrast
import com.thit.ui.theme.backgroundLight
import com.thit.ui.theme.backgroundLightHighContrast
import com.thit.ui.theme.backgroundLightMediumContrast
import com.thit.ui.theme.errorContainerDark
import com.thit.ui.theme.errorContainerDarkHighContrast
import com.thit.ui.theme.errorContainerDarkMediumContrast
import com.thit.ui.theme.errorContainerLight
import com.thit.ui.theme.errorContainerLightHighContrast
import com.thit.ui.theme.errorContainerLightMediumContrast
import com.thit.ui.theme.errorDark
import com.thit.ui.theme.errorDarkHighContrast
import com.thit.ui.theme.errorDarkMediumContrast
import com.thit.ui.theme.errorLight
import com.thit.ui.theme.errorLightHighContrast
import com.thit.ui.theme.errorLightMediumContrast
import com.thit.ui.theme.inverseOnSurfaceDark
import com.thit.ui.theme.inverseOnSurfaceDarkHighContrast
import com.thit.ui.theme.inverseOnSurfaceDarkMediumContrast
import com.thit.ui.theme.inverseOnSurfaceLight
import com.thit.ui.theme.inverseOnSurfaceLightHighContrast
import com.thit.ui.theme.inverseOnSurfaceLightMediumContrast
import com.thit.ui.theme.inversePrimaryDark
import com.thit.ui.theme.inversePrimaryDarkHighContrast
import com.thit.ui.theme.inversePrimaryDarkMediumContrast
import com.thit.ui.theme.inversePrimaryLight
import com.thit.ui.theme.inversePrimaryLightHighContrast
import com.thit.ui.theme.inversePrimaryLightMediumContrast
import com.thit.ui.theme.inverseSurfaceDark
import com.thit.ui.theme.inverseSurfaceDarkHighContrast
import com.thit.ui.theme.inverseSurfaceDarkMediumContrast
import com.thit.ui.theme.inverseSurfaceLight
import com.thit.ui.theme.inverseSurfaceLightHighContrast
import com.thit.ui.theme.inverseSurfaceLightMediumContrast
import com.thit.ui.theme.onBackgroundDark
import com.thit.ui.theme.onBackgroundDarkHighContrast
import com.thit.ui.theme.onBackgroundDarkMediumContrast
import com.thit.ui.theme.onBackgroundLight
import com.thit.ui.theme.onBackgroundLightHighContrast
import com.thit.ui.theme.onBackgroundLightMediumContrast
import com.thit.ui.theme.onErrorContainerDark
import com.thit.ui.theme.onErrorContainerDarkHighContrast
import com.thit.ui.theme.onErrorContainerDarkMediumContrast
import com.thit.ui.theme.onErrorContainerLight
import com.thit.ui.theme.onErrorContainerLightHighContrast
import com.thit.ui.theme.onErrorContainerLightMediumContrast
import com.thit.ui.theme.onErrorDark
import com.thit.ui.theme.onErrorDarkHighContrast
import com.thit.ui.theme.onErrorDarkMediumContrast
import com.thit.ui.theme.onErrorLight
import com.thit.ui.theme.onErrorLightHighContrast
import com.thit.ui.theme.onErrorLightMediumContrast
import com.thit.ui.theme.onPrimaryContainerDark
import com.thit.ui.theme.onPrimaryContainerDarkHighContrast
import com.thit.ui.theme.onPrimaryContainerDarkMediumContrast
import com.thit.ui.theme.onPrimaryContainerLight
import com.thit.ui.theme.onPrimaryContainerLightHighContrast
import com.thit.ui.theme.onPrimaryContainerLightMediumContrast
import com.thit.ui.theme.onPrimaryDark
import com.thit.ui.theme.onPrimaryDarkHighContrast
import com.thit.ui.theme.onPrimaryDarkMediumContrast
import com.thit.ui.theme.onPrimaryLight
import com.thit.ui.theme.onPrimaryLightHighContrast
import com.thit.ui.theme.onPrimaryLightMediumContrast
import com.thit.ui.theme.onSecondaryContainerDark
import com.thit.ui.theme.onSecondaryContainerDarkHighContrast
import com.thit.ui.theme.onSecondaryContainerDarkMediumContrast
import com.thit.ui.theme.onSecondaryContainerLight
import com.thit.ui.theme.onSecondaryContainerLightHighContrast
import com.thit.ui.theme.onSecondaryContainerLightMediumContrast
import com.thit.ui.theme.onSecondaryDark
import com.thit.ui.theme.onSecondaryDarkHighContrast
import com.thit.ui.theme.onSecondaryDarkMediumContrast
import com.thit.ui.theme.onSecondaryLight
import com.thit.ui.theme.onSecondaryLightHighContrast
import com.thit.ui.theme.onSecondaryLightMediumContrast
import com.thit.ui.theme.onSurfaceDark
import com.thit.ui.theme.onSurfaceDarkHighContrast
import com.thit.ui.theme.onSurfaceDarkMediumContrast
import com.thit.ui.theme.onSurfaceLight
import com.thit.ui.theme.onSurfaceLightHighContrast
import com.thit.ui.theme.onSurfaceLightMediumContrast
import com.thit.ui.theme.onSurfaceVariantDark
import com.thit.ui.theme.onSurfaceVariantDarkHighContrast
import com.thit.ui.theme.onSurfaceVariantDarkMediumContrast
import com.thit.ui.theme.onSurfaceVariantLight
import com.thit.ui.theme.onSurfaceVariantLightHighContrast
import com.thit.ui.theme.onSurfaceVariantLightMediumContrast
import com.thit.ui.theme.onTertiaryContainerDark
import com.thit.ui.theme.onTertiaryContainerDarkHighContrast
import com.thit.ui.theme.onTertiaryContainerDarkMediumContrast
import com.thit.ui.theme.onTertiaryContainerLight
import com.thit.ui.theme.onTertiaryContainerLightHighContrast
import com.thit.ui.theme.onTertiaryContainerLightMediumContrast
import com.thit.ui.theme.onTertiaryDark
import com.thit.ui.theme.onTertiaryDarkHighContrast
import com.thit.ui.theme.onTertiaryDarkMediumContrast
import com.thit.ui.theme.onTertiaryLight
import com.thit.ui.theme.onTertiaryLightHighContrast
import com.thit.ui.theme.onTertiaryLightMediumContrast
import com.thit.ui.theme.outlineDark
import com.thit.ui.theme.outlineDarkHighContrast
import com.thit.ui.theme.outlineDarkMediumContrast
import com.thit.ui.theme.outlineLight
import com.thit.ui.theme.outlineLightHighContrast
import com.thit.ui.theme.outlineLightMediumContrast
import com.thit.ui.theme.outlineVariantDark
import com.thit.ui.theme.outlineVariantDarkHighContrast
import com.thit.ui.theme.outlineVariantDarkMediumContrast
import com.thit.ui.theme.outlineVariantLight
import com.thit.ui.theme.outlineVariantLightHighContrast
import com.thit.ui.theme.outlineVariantLightMediumContrast
import com.thit.ui.theme.primaryContainerDark
import com.thit.ui.theme.primaryContainerDarkHighContrast
import com.thit.ui.theme.primaryContainerDarkMediumContrast
import com.thit.ui.theme.primaryContainerLight
import com.thit.ui.theme.primaryContainerLightHighContrast
import com.thit.ui.theme.primaryContainerLightMediumContrast
import com.thit.ui.theme.primaryDark
import com.thit.ui.theme.primaryDarkHighContrast
import com.thit.ui.theme.primaryDarkMediumContrast
import com.thit.ui.theme.primaryLight
import com.thit.ui.theme.primaryLightHighContrast
import com.thit.ui.theme.primaryLightMediumContrast
import com.thit.ui.theme.scrimDark
import com.thit.ui.theme.scrimDarkHighContrast
import com.thit.ui.theme.scrimDarkMediumContrast
import com.thit.ui.theme.scrimLight
import com.thit.ui.theme.scrimLightHighContrast
import com.thit.ui.theme.scrimLightMediumContrast
import com.thit.ui.theme.secondaryContainerDark
import com.thit.ui.theme.secondaryContainerDarkHighContrast
import com.thit.ui.theme.secondaryContainerDarkMediumContrast
import com.thit.ui.theme.secondaryContainerLight
import com.thit.ui.theme.secondaryContainerLightHighContrast
import com.thit.ui.theme.secondaryContainerLightMediumContrast
import com.thit.ui.theme.secondaryDark
import com.thit.ui.theme.secondaryDarkHighContrast
import com.thit.ui.theme.secondaryDarkMediumContrast
import com.thit.ui.theme.secondaryLight
import com.thit.ui.theme.secondaryLightHighContrast
import com.thit.ui.theme.secondaryLightMediumContrast
import com.thit.ui.theme.surfaceDark
import com.thit.ui.theme.surfaceDarkHighContrast
import com.thit.ui.theme.surfaceDarkMediumContrast
import com.thit.ui.theme.surfaceLight
import com.thit.ui.theme.surfaceLightHighContrast
import com.thit.ui.theme.surfaceLightMediumContrast
import com.thit.ui.theme.surfaceVariantDark
import com.thit.ui.theme.surfaceVariantDarkHighContrast
import com.thit.ui.theme.surfaceVariantDarkMediumContrast
import com.thit.ui.theme.surfaceVariantLight
import com.thit.ui.theme.surfaceVariantLightHighContrast
import com.thit.ui.theme.surfaceVariantLightMediumContrast
import com.thit.ui.theme.tertiaryContainerDark
import com.thit.ui.theme.tertiaryContainerDarkHighContrast
import com.thit.ui.theme.tertiaryContainerDarkMediumContrast
import com.thit.ui.theme.tertiaryContainerLight
import com.thit.ui.theme.tertiaryContainerLightHighContrast
import com.thit.ui.theme.tertiaryContainerLightMediumContrast
import com.thit.ui.theme.tertiaryDark
import com.thit.ui.theme.tertiaryDarkHighContrast
import com.thit.ui.theme.tertiaryDarkMediumContrast
import com.thit.ui.theme.tertiaryLight
import com.thit.ui.theme.tertiaryLightHighContrast
import com.thit.ui.theme.tertiaryLightMediumContrast

const val TAG = "Theme--->"
private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun YawKiTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable() () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (isDarkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        isDarkTheme -> darkScheme
        else -> lightScheme
    }

   // Add primary status bar color from chosen color scheme.
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
//            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = isDarkTheme
        }
    }

//    ProvideYawKiColorScheme(colorScheme) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = YawKiTypography,
            shapes = YawKiShape,
            content = content
        )
//    }
}