package com.cinematica.feature.authorization.presentation.screen.android

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cinematica.localization.compose.LocalStrings
import com.cinematica.style.system.appbar.AppBar
import com.cinematica.style.system.button.ButtonWithProgress
import com.cinematica.ui.R

@Composable
fun AndroidAuthorizationScreen(
    onNavigateToWatching: () -> Unit
) {
    val strings = LocalStrings.current
    Scaffold(
        topBar = {
            AppBar(
                title = strings.appName
            )
        },
    ) { rootPadding ->
        Box(
            modifier = Modifier.fillMaxSize().padding(rootPadding).padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.fillMaxSize().padding(bottom = 40.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(id = R.drawable.icon_authentication), contentDescription = "")
                Text(
                    modifier = Modifier.fillMaxWidth().padding(top = 4.dp),
                    text = strings.authorizationAppDescription,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp
                )
            }

            ButtonWithProgress(
                primary = true,
                modifier = Modifier.fillMaxWidth().align(Alignment.BottomCenter),
                onClick = { },
                enabled = true,
                isLoading = false
            ) {
                Text(text = strings.continueWithGoogle,)
            }
        }
    }
}