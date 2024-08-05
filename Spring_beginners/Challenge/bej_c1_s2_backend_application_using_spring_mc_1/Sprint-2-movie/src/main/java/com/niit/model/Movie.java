package com.niit.model;

public class Movie {
    private int movieId;
    private String movieName;
    private String movieDirector;
    private String movieRating;

    public Movie(int movieId, String movieName, String movieDirector, String movieRating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.movieRating = movieRating;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }
}
