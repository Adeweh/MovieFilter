package com.example.moviefilter.controller;

import com.example.moviefilter.model.Reviews;
import com.example.moviefilter.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
@AllArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Reviews> createReviewMethod(@RequestBody Map<String, String> payLoad){

        return ResponseEntity.ok(reviewService.createReviews(payLoad.get("reviewBody"), payLoad.get("imdbId")));
    }



}
