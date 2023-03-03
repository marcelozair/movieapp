package com.example.movieapp.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.movieapp.R
import com.example.movieapp.databinding.ActivityMainBinding
import com.example.movieapp.ui.recyclerview.MovieAdapter
import com.example.movieapp.ui.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainActivityViewModel;
    private lateinit var binding: ActivityMainBinding;
    private lateinit var movieAdapter: MovieAdapter;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        initRecyclerViewMovies()

        loadingObservable()
        movieListObservable();

        viewModel.onCreate();
    }

    private fun movieListObservable() {
        viewModel.movieList.observe(this, Observer {
            movieAdapter.updateMovieList(it.results);
        })
    }

    private fun initRecyclerViewMovies() {
        val recycler = binding.movieList;
        recycler.layoutManager = GridLayoutManager(this, 2)

        movieAdapter = MovieAdapter();
        recycler.adapter = movieAdapter;
    }

    private fun loadingObservable() {
        viewModel.loading.observe(this, Observer {
            binding.loading.isVisible = it;
        })
    }
}