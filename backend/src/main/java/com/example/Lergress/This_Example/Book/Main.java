package com.example.Lergress.This_Example.Book;

public class Main {
    public static void main(String[] args) {
        Book myFavBook = new Book();

        myFavBook.setTitle("Harry Potter");

        System.out.println("Your favorite book is: " + myFavBook.getTitle());
    }
}
