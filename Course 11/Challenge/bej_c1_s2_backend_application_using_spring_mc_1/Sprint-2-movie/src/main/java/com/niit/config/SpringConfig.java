package com.niit.config;
import com.niit.model.Movie;
import org.springframework.context.annotation.Bean;
public class SpringConfig {
    @Bean("prod1")
    public Movie getProduct1()
    {
        return new Movie(101,"Fearless Hyena","Jackie Chan","4.7/5.0");
    }

    @Bean("prod2")
    public Movie getProduct2()
    {
        return new Movie(102,"Tomorrow Never Dies","Roger Spottiswoode","4.1/5.0");
    }
}
