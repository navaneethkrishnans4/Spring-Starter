package com.niit.RestJPApractice.services;

import com.niit.RestJPApractice.domain.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product updateProduct(Product product,int productId);
    boolean deleteProductById(int productId);
    List<Product> getProductByProductName(String productName);

}
