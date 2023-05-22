package com.example.moviefilter.service;

import com.example.moviefilter.model.Movie;
import com.example.moviefilter.repository.MovieRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class MovieServiceImpl implements MovieService{

    private final MovieRepository movieRepository;
    @Override
    public List<Movie> getAllMovies() {


        return movieRepository.findAll();
    }


}
