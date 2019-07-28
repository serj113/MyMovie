package com.nok.mymovie.base

import com.nok.mymovie.api.MoviesApi
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import javax.inject.Inject

abstract class BaseAction {

    private val disposes = CompositeDisposable()

    @Inject
    lateinit var api: MoviesApi

    fun addDisposable(disposable: Disposable?) {
        if (disposable != null) disposes.add(disposable)
    }

    fun clearDisposes() {
        disposes.clear()
    }

}