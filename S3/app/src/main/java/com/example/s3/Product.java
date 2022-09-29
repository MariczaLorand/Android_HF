package com.example.s3;

public class Product {
    String code;
    String name;
    String price;

    public Product(String code, String name, String price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
