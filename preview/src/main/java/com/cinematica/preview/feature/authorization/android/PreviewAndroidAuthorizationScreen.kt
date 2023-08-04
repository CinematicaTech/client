package com.cinematica.preview.feature.authorization.android

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.cinematica.feature.authorization.presentation.screen.android.AndroidAuthorizationScreen
import com.cinematica.style.system.theme.AppTheme

@Composable
@Preview(showBackground = true)
fun PreviewAndroidAuthorizationScreen() {
    AppTheme {
        AndroidAuthorizationScreen {}
    }
}