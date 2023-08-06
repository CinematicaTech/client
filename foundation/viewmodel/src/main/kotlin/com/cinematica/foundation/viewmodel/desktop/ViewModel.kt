package com.cinematica.foundation.viewmodel.desktop

import com.cinematica.foundation.viewmodel.common.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job

abstract class ViewModel : ViewModel {
    override val coroutineScope: CoroutineScope by lazy {
        CoroutineScope(
            Job() + Dispatchers.Default
        )
    }
}