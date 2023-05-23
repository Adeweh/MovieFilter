package com.example.moviefilter.repository;

import com.example.moviefilter.model.Reviews;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Reviews, String> {
}
