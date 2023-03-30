package com.example.moviefilter.repository;

import com.example.moviefilter.model.Genre;
import com.example.moviefilter.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MovieRepository extends MongoRepository<Genre, Integer> {
}
