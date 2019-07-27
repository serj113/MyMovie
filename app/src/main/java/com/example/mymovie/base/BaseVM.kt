package com.nok.mymovie.base

import androidx.lifecycle.AndroidViewModel
import com.nok.mymovie.App

abstract class BaseVM<A: BaseAction>(app: App): AndroidViewModel(app) {

    var actions: A? = null

    abstract fun initActions()

    init {
        initActions()
    }

}