package com.cinematica.foundation.mvi.compose.desktop

import androidx.compose.runtime.Composable
import com.cinematica.foundation.mvi.StateMachine
import com.cinematica.foundation.mvi.UiEffect
import com.cinematica.foundation.mvi.UiEvent
import com.cinematica.foundation.mvi.UiState
import com.cinematica.foundation.mvi.compose.common.AbstractStateMachine
import org.koin.compose.koinInject
import org.koin.core.parameter.ParametersDefinition

class DesktopStateMachine : AbstractStateMachine() {
    @Composable
    override fun <TState : UiState, TEvent : UiEvent, TEffect : UiEffect> stateMachine(
        parameters: ParametersDefinition?
    ): StateMachine<TState, TEvent, TEffect> = koinInject(parameters = parameters)
}