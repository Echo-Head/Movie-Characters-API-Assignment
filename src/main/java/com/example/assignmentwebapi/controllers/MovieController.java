package com.example.assignmentwebapi.controllers;

import com.example.assignmentwebapi.mappers.CharacterMapper;
import com.example.assignmentwebapi.mappers.MovieMapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/movies")
@Tag(name = "Movies", description = "Endpoints to interact with movies")
public class MovieController {

    private final MovieService movieService;
    private final MovieMapper movieMapper;
    private final CharacterMapper characterMapper;

    public MovieController(MovieMapper movieMapper,
                           MovieService movieService,
                           CharacterMapper characterMapper) {
        this.movieMapper = movieMapper;
        this.movieService = movieService;
        this.characterMapper = characterMapper;

    }
}
