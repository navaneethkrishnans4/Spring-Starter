package com.niit.driver;

import com.niit.config.SpringConfig;
import com.niit.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Product prd1 = (Product) context.getBean("prod1");
        System.out.println("Product ID :: "+prd1.getProductId());
        System.out.println("Product Name :: "+prd1.getProductName());
        System.out.println("Product Description :: "+prd1.getProductDescription());

        Product prd2 = (Product) context.getBean("prod2");
        System.out.println("Product ID :: "+prd2.getProductId());
        System.out.println("Product Name :: "+prd2.getProductName());
        System.out.println("Product Description :: "+prd2.getProductDescription());
    }
}
