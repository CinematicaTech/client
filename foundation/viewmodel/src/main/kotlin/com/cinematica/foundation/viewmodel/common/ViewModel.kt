package com.cinematica.foundation.viewmodel.common

import kotlinx.coroutines.CoroutineScope

interface ViewModel {
    val coroutineScope: CoroutineScope
}