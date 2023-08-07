package com.cinematica.localization.compose

import androidx.compose.runtime.staticCompositionLocalOf
import com.cinematica.localization.EnglishStrings
import com.cinematica.localization.Strings

val LocalStrings = staticCompositionLocalOf<Strings> { EnglishStrings }