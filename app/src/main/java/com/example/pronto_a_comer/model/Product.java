package com.example.pronto_a_comer.model;

import java.io.Serializable;

public class Product implements Serializable {

    private int productId;

    private String productName;

    private double productPrice;

    private int productImage;


    public Product(int productId, String productName, double productPrice, int productImage) {

        this.productId = productId;

        this.productName = productName;

        this.productPrice = productPrice;

        this.productImage = productImage;

    }


    public String getProductName() {

        return productName;

    }

    public double getProductPrice() {

        return productPrice;

    }

    public int getProductImage() {

        return productImage;

    }


}
















