package com.example.moviefilter.repository;

import com.example.moviefilter.model.MovieResponseData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<MovieResponseData, String> {
}
