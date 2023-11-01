package com.cinematica.platform.desktop

import androidx.compose.material.Text
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.cinematica.sdk.grpc.GrpcCinematicaRequestsEngine
import com.cinematica.sdk.core.authorization.api.AuthorizationApi

fun main() {
    application {
        Window(onCloseRequest = ::exitApplication) {
            Text("Hello Desktop 12!")
        }
    }
}