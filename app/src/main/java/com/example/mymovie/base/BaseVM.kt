package com.example.mymovie.base

import androidx.lifecycle.AndroidViewModel
import com.example.mymovie.App

abstract class BaseVM<A: BaseAction>(app: App): AndroidViewModel(app) {

    var actions: A? = null

    abstract fun initActions()

    init {
        initActions()
    }

}