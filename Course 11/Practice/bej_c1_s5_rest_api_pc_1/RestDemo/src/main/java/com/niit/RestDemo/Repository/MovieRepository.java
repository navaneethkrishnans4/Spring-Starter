package com.niit.RestDemo.Repository;

import com.niit.RestDemo.Domain.Movie;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie,Integer> {
}
