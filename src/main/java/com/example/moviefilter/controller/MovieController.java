package com.example.moviefilter.controller;

import com.example.moviefilter.model.Movie;
import com.example.moviefilter.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movie")
@AllArgsConstructor
public class MovieController {
    private final MovieService movieService;
        @GetMapping("/ok")
        public ResponseEntity<List<Movie>> getAllMovies() {
            return ResponseEntity.ok(movieService.getAllMovies());
        }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movie>> getAMovie(@PathVariable String id) {
        return ResponseEntity.ok(movieService.getAMovies(id));
    }






}
