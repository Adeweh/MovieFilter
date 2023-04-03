package com.example.moviefilter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Document
public class Movie {
    @Id
    private String id;

    private MovieResponseData movieResponse;
//    private String title;
//    private int releaseYear;
    private Genre genre;
//    private List<Cast> actors;
}
