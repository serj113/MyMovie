package com.nok.mymovie.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "movie")
data class Movie (
    @PrimaryKey
    @ColumnInfo(name="id")
    var id: Int = 0,
    @ColumnInfo(name="adult")
    var adult: Boolean = false,
    @ColumnInfo(name="backdrop_path")
    var backdrop_path: String = "",
    @Ignore
    var genre_ids: List<Int> = listOf(),
    @ColumnInfo(name="original_language")
    var original_language: String = "",
    @ColumnInfo(name="original_title")
    var original_title: String = "",
    @ColumnInfo(name="overview")
    var overview: String = "",
    @ColumnInfo(name="poster_path")
    var poster_path: String = "",
    @ColumnInfo(name="release_date")
    var release_date: String = "",
    @ColumnInfo(name="title")
    var title: String = "",
    @ColumnInfo(name="video")
    var video: String = "",
    @ColumnInfo(name="vote_average")
    var vote_average: Double = 0.0,
    @ColumnInfo(name="vote_count")
    var vote_count: Int = 0,
    @ColumnInfo(name="popularity")
    var popularity: Double = 0.0
)