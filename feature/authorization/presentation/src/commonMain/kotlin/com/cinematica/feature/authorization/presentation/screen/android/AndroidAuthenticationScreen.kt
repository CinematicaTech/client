package com.cinematica.feature.authorization.presentation.screen.android

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cinematica.localization.compose.LocalStrings
import com.cinematica.style.system.appbar.AppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AndroidAuthorizationScreen(
    onNavigateToFilms: () -> Unit
) {
    Scaffold(
        topBar = {
            AppBar(
                title = LocalStrings.current.appName
            )
        },
    ) { rootPadding ->
        Box(modifier = Modifier.fillMaxSize().padding(rootPadding).padding(16.dp)) {

        }
    }
}