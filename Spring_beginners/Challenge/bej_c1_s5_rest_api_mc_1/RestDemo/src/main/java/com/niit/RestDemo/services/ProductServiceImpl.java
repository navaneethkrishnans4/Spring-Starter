package com.niit.RestDemo.services;

import com.niit.RestDemo.domain.Product;
import com.niit.RestDemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product)
    {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts()
    {
        return (List<Product>) productRepository.findAll();
    }
}
