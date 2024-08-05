package com.niit.RestDemo.Services;

import com.niit.RestDemo.Domain.Movie;

import java.util.List;

public interface MovieService {
    Movie saveMovie(Movie movie);
    List<Movie> getAllMovies();
}
