package com.example.Lergress.Getters_Example.Product;

public class Product {
    private String name;
    private double price;
    private int barcode;
    private int amount;

    // getters to show the product info
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getBarCode() {
        return barcode;
    }

    public int getAmount() {
        return amount;
    }

    public Product(String name, double price, int barcode, int amount) {
        this.name = name;
        this.price = price;
        this.barcode = barcode;
        this.amount = amount;
    }

    public double TotalPrice() {
        return price * amount;
    } 

}