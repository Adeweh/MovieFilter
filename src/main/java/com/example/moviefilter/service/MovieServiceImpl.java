package com.example.moviefilter.service;

import com.example.moviefilter.repository.MovieRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
@Slf4j
public class MovieServiceImpl implements MovieService{
    private final RestTemplate restTemplate;

    private final String addToken = System.getenv("API_KEY");

    private final String addURL = System.getenv("URL");


    private final MovieRepository movieRepository;
    @Override
    public Object requestMovie() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.AUTHORIZATION, "Bearer " + addToken);
        httpHeaders.add(HttpHeaders.CONTENT_TYPE, "application/json");
        log.info("===={}====",addURL);
        log.info("===={}====",addToken);

        HttpEntity<?> httpEntity = new HttpEntity<>(httpHeaders);
        log.info("--->{}", httpHeaders);

        ResponseEntity <?> response = restTemplate.exchange(addURL, HttpMethod.GET, httpEntity, Object.class);
        Object saveResponse = response.getBody();
        MovieResponseData movieResponse = new MovieResponseData();
        movieResponse.setResponses(saveResponse);

        movieRepository.save(movieResponse);

        return response.getBody();
    }


}
