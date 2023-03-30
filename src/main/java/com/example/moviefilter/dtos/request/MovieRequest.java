package com.example.moviefilter.dtos.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class MovieRequest {
    private String genre;
    private int releaseYear;
}
