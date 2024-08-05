package com.niit.RestDemo.Services;

import com.niit.RestDemo.Domain.Movie;
import com.niit.RestDemo.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    private MovieRepository movieRepository;
    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie saveMovie(Movie movie)
    {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> getAllMovies()
    {
        return (List<Movie>) movieRepository.findAll();
    }
}
