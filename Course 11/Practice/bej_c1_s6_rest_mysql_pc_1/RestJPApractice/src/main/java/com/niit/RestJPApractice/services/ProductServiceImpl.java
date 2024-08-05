package com.niit.RestJPApractice.services;

import com.niit.RestJPApractice.domain.Product;
import com.niit.RestJPApractice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Product updateProduct(Product product, int productId) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        if(optionalProduct.isEmpty()){
            return null;
        }

        Product existingProduct = optionalProduct.get();
        if(product.getProductName()!=null)
        {
            existingProduct.setProductName(product.getProductName());
        }
        if(product.getAmountInStock()!=null)
        {
            existingProduct.setAmountInStock(product.getAmountInStock());
        }
        return productRepository.save(existingProduct);

    }

    @Override
    public boolean deleteProductById(int productId) {
        if(productRepository.existsById(productId))
        {
            productRepository.deleteById(productId);
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public List<Product> getProductByProductName(String productName) {
        return (List<Product>) productRepository.findByProductName(productName);
    }
}
