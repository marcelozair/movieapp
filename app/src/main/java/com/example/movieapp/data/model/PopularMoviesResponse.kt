package com.example.movieapp.data.model

data class PopularMoviesResponse(
    val page: Number,
    val results: List<Movie>,
    val total_pages: Number,
    val total_results: Number,
)