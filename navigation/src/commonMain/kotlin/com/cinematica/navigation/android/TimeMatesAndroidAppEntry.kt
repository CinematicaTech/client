package com.cinematica.navigation.android

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.plus
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.scale
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.push
import com.cinematica.feature.authorization.presentation.screen.android.AndroidAuthorizationScreen
import com.cinematica.navigation.common.ChildStack
import com.cinematica.navigation.common.Screen
import com.cinematica.style.system.theme.AppTheme
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach

@Composable
fun CinematicaAndroidAppEntry(
    navigation: StackNavigation<Screen> = remember { StackNavigation() },
    initialScreen: Screen = Screen.AuthorizationScreen,
    isDarkTheme: Boolean = false,
    navigateToAuthorization: ReceiveChannel<Unit>,
) = AppTheme(isDarkTheme) {

    LaunchedEffect(Unit) {
        navigateToAuthorization.consumeEach {
            navigation.push(Screen.AuthorizationScreen)
        }
    }

    ChildStack(
        source = navigation,
        initialStack = { listOf(initialScreen) },
        animation = stackAnimation(fade() + scale()),
    ) { screen ->
        when (screen) {
            Screen.AuthorizationScreen -> AndroidAuthorizationScreen(
                onNavigateToFilms = { }
            )
//            Screen.AuthorizationScreen -> StartAuthorizationScreen(
//                stateMachine = stateMachine(),
//                onNavigateToConfirmation = {
//                    navigation.push(Screen.AfterStart(it.string))
//                },
//            )
        }
    }
}