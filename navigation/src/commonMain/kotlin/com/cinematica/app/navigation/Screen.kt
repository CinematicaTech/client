package com.cinematica.app.navigation

import com.arkivanov.essenty.parcelable.Parcelable
import com.arkivanov.essenty.parcelable.Parcelize

sealed class Screen : Parcelable {
    @Parcelize
    object AuthorizationScreen : Screen()
}

fun main() {
}