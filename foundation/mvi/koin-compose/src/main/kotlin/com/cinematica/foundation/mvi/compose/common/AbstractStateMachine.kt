package com.cinematica.foundation.mvi.compose.common

import androidx.compose.runtime.Composable
import com.cinematica.foundation.mvi.StateMachine
import com.cinematica.foundation.mvi.UiEffect
import com.cinematica.foundation.mvi.UiEvent
import com.cinematica.foundation.mvi.UiState
import org.koin.core.parameter.ParametersDefinition

abstract class AbstractStateMachine {
    @Composable
    abstract fun <TState : UiState, TEvent : UiEvent, TEffect : UiEffect> stateMachine(
        parameters: ParametersDefinition?,
    ): StateMachine<TState, TEvent, TEffect>
}