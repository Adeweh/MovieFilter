package com.example.moviefilter.service;

import com.example.moviefilter.model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    List<Movie> getAllMovies();


    Optional<Movie> getAMovies(String imdbId);
}
