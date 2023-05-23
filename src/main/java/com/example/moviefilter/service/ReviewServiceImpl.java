package com.example.moviefilter.service;

import com.example.moviefilter.model.Movie;
import com.example.moviefilter.model.Reviews;
import com.example.moviefilter.repository.ReviewRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService{
    private final ReviewRepository repository;

    private final MongoTemplate mongoTemplate;

    @Override
    public Reviews createReviews(String reviewBody, String imdbId) {
        Reviews reviews = repository.insert(new Reviews(reviewBody));

        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(reviews))
                .first();
        return reviews;
    }
}
