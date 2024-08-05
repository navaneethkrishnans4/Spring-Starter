package com.niit.RestDemo.Controller;

import com.niit.RestDemo.Domain.Movie;
import com.niit.RestDemo.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService)
    {
        this.movieService = movieService;
    }

    @PostMapping("/movie")
    public ResponseEntity<?> saveMovie(@RequestBody Movie movie)
    {
        Movie movie1 = movieService.saveMovie(movie);
        return new ResponseEntity<>(movie1, HttpStatus.CREATED);

    }

    @GetMapping("/movies")
    public ResponseEntity<?> getAllMovies()
    {
        List list = movieService.getAllMovies();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

}
