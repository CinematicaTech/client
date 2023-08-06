package com.cinematica.foundation.viewmodel.android

import com.cinematica.foundation.viewmodel.common.ViewModel
import androidx.lifecycle.ViewModel as AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope

abstract class ViewModel : ViewModel, AndroidViewModel() {
    /**
     * The coroutine scope associated with this common.ViewModel.
     *
     * The `viewModelScope` is a [CoroutineScope] provided by the Android Jetpack's common.ViewModel library.
     * It is used to launch coroutines that are scoped to the lifecycle of the common.ViewModel.
     * Any coroutines launched in this scope will automatically be canceled when the common.ViewModel is cleared or destroyed.
     *
     * @see [ViewModel]
     * @see [CoroutineScope]
     */
    override val coroutineScope: CoroutineScope by ::viewModelScope
}