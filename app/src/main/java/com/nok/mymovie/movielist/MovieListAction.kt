package com.nok.mymovie.movielist

import com.nok.mymovie.base.BaseAction
import com.nok.mymovie.model.Response
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class MovieListAction: BaseAction() {

    fun getTrendingMovies(
            onSuccess: (Response) -> Unit,
            onError: (Throwable) -> Unit
        ) {
        val disposable: Disposable? = api.getTrendingMovies()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    onSuccess(it)
                },
                {
                    onError(it)
                }
            )
        addDisposable(disposable)
    }

}