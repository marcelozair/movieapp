package com.example.movieapp.ui.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movieapp.R
import com.example.movieapp.domain.model.Movie
import com.example.movieapp.databinding.MovieBinding
import com.example.movieapp.utils.Dates

class MovieViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    private val binding = MovieBinding.bind(view);

    fun render(movie: Movie) {
        binding.movieImage.setImageResource(R.drawable.ic_launcher_background);

        binding.movieTitle.text = movie.title;
        binding.movieDate.text = Dates.formatterDate(movie.release_date);

        Glide.with(binding.root).load("https://image.tmdb.org/t/p/w500${movie.poster_path}")
            .centerCrop().placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background).into(binding.movieImage)
    }
}