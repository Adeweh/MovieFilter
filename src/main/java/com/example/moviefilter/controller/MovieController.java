package com.example.moviefilter.controller;

import com.example.moviefilter.dtos.request.MovieRequest;
import com.example.moviefilter.dtos.response.MovieResponse;
import com.example.moviefilter.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movie")
@AllArgsConstructor
public class MovieController {
    private final MovieService movieService;
        @GetMapping("/ok")
        public ResponseEntity<?> getMovies() {
            return ResponseEntity.ok(movieService.requestMovie());

        }






}
