package com.example.moviefilter.service;

import com.example.moviefilter.dtos.request.MovieRequest;
import com.example.moviefilter.dtos.response.MovieResponse;
import com.example.moviefilter.model.Movie;
import com.example.moviefilter.repository.MovieRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
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
    private final RestTemplate restTemplate;

    private final String addToken = System.getenv("API_KEY");

    private final String addURL = System.getenv("URL");


    private final MovieRepository movieRepository;
    @Override
    public MovieResponse requestMovie() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.AUTHORIZATION, addToken);
        httpHeaders.add(HttpHeaders.CONTENT_TYPE, "application/json");
        log.info("===={}====",addURL);
        log.info("===={}====",addToken);

        HttpEntity<?> httpEntity = new HttpEntity<>(httpHeaders);
        log.info("--->{}", httpHeaders);
        ResponseEntity <MovieResponse> response = restTemplate.exchange(addURL, HttpMethod.GET, httpEntity, MovieResponse.class);
//        movieRepository.save(response);
        return response.getBody();
    }


}
