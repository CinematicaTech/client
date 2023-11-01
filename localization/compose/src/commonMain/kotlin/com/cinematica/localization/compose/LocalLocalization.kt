package com.cinematica.localization.compose

import androidx.compose.runtime.staticCompositionLocalOf
import com.cinematica.sdk.localization.EnglishStrings
import com.cinematica.sdk.localization.Strings

val LocalStrings = staticCompositionLocalOf<Strings> { EnglishStrings }