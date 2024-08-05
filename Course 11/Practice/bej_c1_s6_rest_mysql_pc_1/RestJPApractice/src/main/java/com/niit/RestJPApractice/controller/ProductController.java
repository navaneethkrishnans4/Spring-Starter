package com.niit.RestJPApractice.controller;

import com.niit.RestJPApractice.domain.Product;
import com.niit.RestJPApractice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
        List<Product> list = productService.getAllProducts();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @GetMapping("/product/{productName}")
    public ResponseEntity<?> getProductByProductName(@PathVariable String productName)
    {
        List<Product> list = productService.getProductByProductName(productName);
        return new ResponseEntity<>(list,HttpStatus.FOUND);
    }

    @DeleteMapping("/product/{productId}")
    public ResponseEntity<?> deleteProductById(@PathVariable int productId)
    {
        return new ResponseEntity<>(productService.deleteProductById(productId),HttpStatus.OK);
    }

    @PutMapping("/product/{productId}")
    public ResponseEntity<?> updateProduct(@RequestBody Product product, @PathVariable int productId)
    {
        return new ResponseEntity<>(productService.updateProduct(product,productId),HttpStatus.OK);
    }

}
