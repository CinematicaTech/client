package com.cinematica.navigation.common

import com.arkivanov.essenty.parcelable.Parcelable
import com.arkivanov.essenty.parcelable.Parcelize

sealed class Screen : Parcelable {
    @Parcelize
    data object AuthorizationScreen : Screen()
}