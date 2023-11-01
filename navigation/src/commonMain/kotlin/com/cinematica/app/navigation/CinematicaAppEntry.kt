package com.cinematica.app.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.arkivanov.decompose.router.stack.StackNavigation
import com.cinematica.style.system.theme.AppTheme
import kotlinx.coroutines.channels.ReceiveChannel

@Composable
fun CinematicaAppEntry(
    navigation: StackNavigation<Screen> = remember { StackNavigation() },
    initialScreen: Screen = Screen.AuthorizationScreen,
    isDarkTheme: Boolean = false,
    navigateToAuthorization: ReceiveChannel<Unit>,
) = AppTheme(isDarkTheme) {

//    LaunchedEffect(Unit) {
//        navigateToAuthorization.consumeEach {
//            navigation.push(Screen.AuthorizationScreen)
//        }
//    }
//
//    ChildStack(
//        source = navigation,
//        initialStack = { listOf(initialScreen) },
//        animation = stackAnimation(fade() + scale()),
//    ) { screen ->
//        // todo val state = androidStateMachine.stateMachine(null)
//        when (screen) {
//            Screen.AuthorizationScreen -> AuthorizationScreen(
//                onNavigateToWatching = {  }
//            )
//        }
//    }
}