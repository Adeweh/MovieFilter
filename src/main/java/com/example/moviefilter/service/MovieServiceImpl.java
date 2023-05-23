package com.example.moviefilter.service;

import com.example.moviefilter.model.Movie;
import com.example.moviefilter.repository.MovieRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class MovieServiceImpl implements MovieService{

    private final MovieRepository movieRepository;
    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> getAMovies(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }


}
