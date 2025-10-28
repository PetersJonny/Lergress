package com.example.Lergress.Getters_Example.Product;

public class Main {
    public static void main(String[] args) {
        Product chocolate = new Product("chocolate", 5.00, 25615637, 5);

        System.out.printf("The product that you have is %s, the price is %.2f, the barcode is %d and you have %d", chocolate.getName(), chocolate.getPrice(), chocolate.getBarCode(), chocolate.getAmount());

        System.out.printf("\nThe total price of the products is %.2f", chocolate.TotalPrice());

    }
}
