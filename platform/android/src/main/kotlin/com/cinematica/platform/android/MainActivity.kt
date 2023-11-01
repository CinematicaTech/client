package com.cinematica.platform.android

import android.os.Bundle
import androidx.activity.addCallback
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.defaultComponentContext
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.pop
import com.cinematica.app.navigation.CinematicaAppEntry
import com.cinematica.app.navigation.LocalComponentContext
import com.cinematica.app.navigation.Screen
import com.cinematica.style.system.theme.AppTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val componentContent = defaultComponentContext()
        setContent {
            val systemUiController = rememberSystemUiController()
            val navigation: StackNavigation<Screen> = remember { StackNavigation() }

            LaunchedEffect(Unit) {
                onBackPressedDispatcher.addCallback(this@MainActivity) {
                    navigation.pop { isSuccess ->
                        if (!isSuccess) finish()
                    }
                }
            }

            CompositionLocalProvider(LocalComponentContext provides componentContent) {
                AppTheme {
                    Box(modifier = Modifier.fillMaxSize()) {
                        systemUiController.setSystemBarsColor(AppTheme.colors.background)

                        CinematicaAppEntry(
                            navigation = navigation,
                            navigateToAuthorization = CinematicaApplication.AUTH_FAILED_CHANNEL,
                        )
                    }
                }
            }
        }
    }
}