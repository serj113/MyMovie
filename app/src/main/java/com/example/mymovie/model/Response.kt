package com.example.mymovie.model

data class Response (
    val Status: Int,
    val Message: String,
    val Data: List<Movie>
)