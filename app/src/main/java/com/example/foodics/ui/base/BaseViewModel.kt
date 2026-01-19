package com.example.foodics.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

abstract class BaseViewModel<State, Effect>(
    initialState: State
) : ViewModel() {

    private val _screenState = MutableStateFlow(initialState)
    val screenState: StateFlow<State> = _screenState.asStateFlow()

    private val _effect = MutableSharedFlow<Effect>()
    val effect = _effect.asSharedFlow()

    fun updateState(transform: (State) -> State) {
        _screenState.update { transform(it) }
    }

    protected fun sendEffect(
        event: Effect,
        onStart: suspend () -> Unit = {},
        onEnd: suspend () -> Unit = {},
    ) {
        viewModelScope.launch(Dispatchers.Main) {
            onStart()
            _effect.emit(event)
            onEnd()
        }
    }

    protected fun <R> tryToCall(
        block: suspend () -> R,
        onSuccess: suspend (R) -> Unit = {},
        onError: suspend (Throwable) -> Unit = {},
        onStart: suspend () -> Unit = {},
        onEnd: suspend () -> Unit = {},
        dispatcher: CoroutineDispatcher = Dispatchers.IO
    ): Job {
        return viewModelScope.launch(dispatcher) {
            onStart()
            try {
                val result = block()
                onSuccess(result)
            } catch (e: Throwable) {
                onError(e)
            }
            onEnd()
        }
    }
}