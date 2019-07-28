package com.nok.mymovie.base

import androidx.lifecycle.AndroidViewModel
import com.nok.mymovie.App

abstract class BaseVM<A: BaseAction>(app: App): AndroidViewModel(app) {

    protected abstract val action: A

    private fun injectAction() {
        getApplication<App>().getInjector().inject(action)
    }

    init {
        injectAction()
    }

}