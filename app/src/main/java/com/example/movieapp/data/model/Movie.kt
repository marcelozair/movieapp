package com.example.movieapp.data.model

data class Movie(
    val id: Number,
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: List<Number>,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Float,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: Float,
    val vote_count: Float,
)
