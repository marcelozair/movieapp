package com.example.movieapp.domain.model.response

import com.example.movieapp.domain.model.Movie

data class PopularMoviesResponse(
    val page: Number,
    val results: List<Movie>,
    val total_pages: Number,
    val total_results: Number,
)