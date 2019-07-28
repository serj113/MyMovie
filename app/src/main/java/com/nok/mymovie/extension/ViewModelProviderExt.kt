package com.nok.mymovie.extension

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

fun <T : ViewModel> createFor(model: T): ViewModelProvider.Factory {
    return object : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(model.javaClass)) {
                @Suppress("UNCHECKED_CAST")
                return model as T
            }
            throw IllegalArgumentException("unexpected model class $modelClass")
        }
    }
}