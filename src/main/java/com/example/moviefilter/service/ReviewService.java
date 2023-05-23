package com.example.moviefilter.service;

import com.example.moviefilter.model.Reviews;

public interface ReviewService {

    Reviews createReviews(String reviewBody, String imdbId);
}
