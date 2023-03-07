package com.example.movieapp.ui.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.R
import com.example.movieapp.domain.model.Movie

class MovieAdapter(): RecyclerView.Adapter<MovieViewHolder>() {
    private var movieList: MutableList<Movie> = mutableListOf();

    fun updateMovieList(movies: List<Movie>) {
        movieList.clear();
        movieList.addAll(movies)

        notifyDataSetChanged();
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val layoutInflate = LayoutInflater.from(parent.context);
        return MovieViewHolder(layoutInflate.inflate(R.layout.movie, parent, false));
    }

    override fun getItemCount(): Int = movieList.size;

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movieList[position];
        holder.render(movie);
    }
}