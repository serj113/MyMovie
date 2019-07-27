package com.nok.mymovie.base

import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class BaseFragment<V>: Fragment() {

    var vm: V? = null

    abstract fun initVM()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initVM()
    }

}