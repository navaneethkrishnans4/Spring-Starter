package com.niit.RestJPApractice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ProductDemo")
public class Product {
    @Id
    int productId;
    String productName;
    Float amountInStock;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(Float amountInStock) {
        this.amountInStock = amountInStock;
    }

}
