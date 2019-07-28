package com.nok.mymovie.base

import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class BaseFragment<V>: Fragment() {

    protected abstract val vm: V

    // override fun onCreate(savedInstanceState: Bundle?) {
    //     super.onCreate(savedInstanceState)
    //     initVM()
    // }

}