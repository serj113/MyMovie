package com.nok.mymovie.base

import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class BaseFragment<V: VM>: Fragment() {

    protected abstract fun initVM()

    protected abstract fun getVM(): V

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initVM()
        getVM().onCreate()
    }

}