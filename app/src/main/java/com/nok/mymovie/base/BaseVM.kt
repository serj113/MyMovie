package com.nok.mymovie.base

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.nok.mymovie.App

abstract class BaseVM<A: BaseAction>(app: Application): AndroidViewModel(app), VM {

    protected abstract val action: A

    override fun onCreate() {
        injectAction()
    }

    override fun onCleared() {
        action.clearDisposes()
        super.onCleared()
    }

    private fun injectAction() {
        getApplication<App>().getInjector().inject(action)
    }

}