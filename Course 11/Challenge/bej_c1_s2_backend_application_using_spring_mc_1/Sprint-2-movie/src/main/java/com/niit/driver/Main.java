package com.niit.driver;

import com.niit.config.SpringConfig;
import com.niit.model.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Movie prd1 = (Movie) context.getBean("prod1");
        System.out.println("Movie ID :: "+prd1.getMovieId());
        System.out.println("Movie Name :: "+prd1.getMovieName());
        System.out.println("Movie Description :: "+prd1.getMovieDirector());
        System.out.println("Movie Rating :: "+prd1.getMovieRating());

        Movie prd2 = (Movie) context.getBean("prod2");
        System.out.println("Movie ID :: "+prd2.getMovieId());
        System.out.println("Movie Name :: "+prd2.getMovieName());
        System.out.println("Movie Description :: "+prd2.getMovieDirector());
        System.out.println("Movie Rating :: "+prd2.getMovieRating());
    }
}
