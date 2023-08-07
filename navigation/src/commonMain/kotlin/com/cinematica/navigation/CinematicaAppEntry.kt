package com.cinematica.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.plus
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.scale
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.push
import com.cinematica.feature.authorization.screen.AuthorizationScreen
import com.cinematica.style.system.theme.AppTheme
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach

@Composable
fun CinematicaAppEntry(
    navigation: StackNavigation<Screen> = remember { StackNavigation() },
    initialScreen: Screen = Screen.AuthorizationScreen,
    isDarkTheme: Boolean = false,
    navigateToAuthorization: ReceiveChannel<Unit>,
    // todo androidStateMachine: AndroidStateMachine
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
        // todo val state = androidStateMachine.stateMachine(null)
        when (screen) {
            Screen.AuthorizationScreen -> AuthorizationScreen(
                onNavigateToWatching = {  }
            )
        }
    }
}