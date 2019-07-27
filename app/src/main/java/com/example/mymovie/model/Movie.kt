package com.nok.mymovie.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact")
data class Movie (
    @PrimaryKey
    @ColumnInfo(name="id")
    val id: String,
    @ColumnInfo(name="name")
    val name: String,
    @ColumnInfo(name="phone")
    val phone: String,
    @ColumnInfo(name="email")
    val email: String
)