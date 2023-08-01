package com.cinematica.feature.authorization.presentation.screen.android

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AndroidAuthorizationScreen() {
//    Scaffold(
//        topBar = {
//            AppBar(
//                title = LocalStrings.current.authorization
//            )
//        },
//    ) { rootPadding ->
//        Box(modifier = Modifier.fillMaxSize().padding(rootPadding).padding(16.dp)) {
//            Column(
//                modifier = Modifier.padding(bottom = ButtonDefaults.MinHeight),
//                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
//                horizontalAlignment = Alignment.CenterHorizontally,
//            ) {
//                val supportText = when {
//                    state.isEmailInvalid -> LocalStrings.current.emailIsInvalid
//                    state.isEmailLengthSizeInvalid -> LocalStrings.current.emailSizeIsInvalid
//                    else -> null
//                }
//
//                OutlinedTextField(
//                    modifier = Modifier.fillMaxWidth(),
//                    leadingIcon = { Icon(Icons.Outlined.Email, contentDescription = null) },
//                    value = state.email,
//                    onValueChange = { stateMachine.dispatchEvent(Event.EmailChange(it)) },
//                    label = { Text(LocalStrings.current.email) },
//                    isError = state.isEmailInvalid || state.isEmailLengthSizeInvalid,
//                    supportingText = { if (supportText != null) Text(supportText) },
//                    enabled = !state.isLoading,
//                    singleLine = true,
//                )
//            }
//
//
//            Column(
//                modifier = Modifier.fillMaxWidth().align(Alignment.BottomEnd),
//                verticalArrangement = Arrangement.spacedBy(8.dp),
//            ) {
//                SnackbarHost(
//                    hostState = snackbarData,
//                ) {
//                    Snackbar(it)
//                }
//
//                ButtonWithProgress(
//                    enabled = !state.isLoading,
//                    primary = true,
//                    modifier = Modifier.fillMaxWidth(),
//                    onClick = { stateMachine.dispatchEvent(Event.OnStartClick) },
//                    isLoading = state.isLoading
//                ) {
//                    Text(text = LocalStrings.current.start)
//                }
//            }
//        }
//    }
}