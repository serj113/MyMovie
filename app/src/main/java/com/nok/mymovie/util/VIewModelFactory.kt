package com.nok.mymovie.util

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nok.mymovie.App
import com.nok.mymovie.movielist.MovieListVM

class ViewModelFactory(private val activity: AppCompatActivity): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MovieListVM::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return MovieListVM(activity.application as App) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")

    }
}