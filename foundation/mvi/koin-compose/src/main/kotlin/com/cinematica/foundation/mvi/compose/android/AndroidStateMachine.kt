package com.cinematica.foundation.mvi.compose.android

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import com.cinematica.foundation.mvi.StateMachine
import com.cinematica.foundation.mvi.UiEffect
import com.cinematica.foundation.mvi.UiEvent
import com.cinematica.foundation.mvi.UiState
import com.cinematica.foundation.mvi.compose.common.AbstractStateMachine
import com.cinematica.foundation.viewmodel.android.ViewModel
import org.koin.androidx.compose.defaultExtras
import org.koin.androidx.viewmodel.resolveViewModel
import org.koin.compose.LocalKoinScope
import org.koin.core.annotation.KoinInternalApi
import org.koin.core.parameter.ParametersDefinition
import org.koin.core.qualifier.Qualifier
import org.koin.core.scope.Scope

class AndroidStateMachine : AbstractStateMachine() {
    @Composable
    override fun <TState : UiState, TEvent : UiEvent, TEffect : UiEffect> stateMachine(
        parameters: ParametersDefinition?
    ): StateMachine<TState, TEvent, TEffect> = koinVM(parameters = parameters)
}

@OptIn(KoinInternalApi::class)
@PublishedApi
@Composable
internal inline fun <reified T : ViewModel> koinVM(
    qualifier: Qualifier? = null,
    viewModelStoreOwner: ViewModelStoreOwner = checkNotNull(LocalViewModelStoreOwner.current) {
        "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
    },
    key: String? = null,
    extras: CreationExtras = defaultExtras(viewModelStoreOwner),
    scope: Scope = LocalKoinScope.current,
    noinline parameters: ParametersDefinition? = null,
): T {
    return resolveViewModel(
        T::class, viewModelStoreOwner.viewModelStore, key, extras, qualifier, scope, parameters
    )
}
