package com.niit.RestDemo.controller;

import com.niit.RestDemo.domain.Product;
import com.niit.RestDemo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }

    @PostMapping("/product")
    public ResponseEntity<?> saveProduct(@RequestBody Product product)
    {
        Product product1 = productService.saveProduct(product);
        return new ResponseEntity<>(product1, HttpStatus.CREATED);

    }

    @GetMapping("/product")
    public ResponseEntity<?> getAllProducts()
    {
        List list = productService.getAllProducts();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

}
