package com.niit.config;
import com.niit.model.Product;
import org.springframework.context.annotation.Bean;
public class SpringConfig {
    @Bean("prod1")
    public Product getProduct1()
    {
        return new Product(101,"car","Has 4 wheels");
    }

    @Bean("prod2")
    public Product getProduct2()
    {
        return new Product(102,"bike","Has 2 wheels");
    }
}
