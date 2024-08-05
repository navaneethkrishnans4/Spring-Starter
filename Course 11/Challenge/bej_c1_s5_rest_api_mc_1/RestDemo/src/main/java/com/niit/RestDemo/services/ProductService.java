package com.niit.RestDemo.services;

import com.niit.RestDemo.domain.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
}
