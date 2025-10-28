package com.example.Lergress.This_Example.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 2);

        System.out.println("Base: " + rectangle.getBase());
        System.out.println("height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());

        rectangle.setRectangle(-10, 6);

        System.out.println("Base: " + rectangle.getBase());
        System.out.println("height: " + rectangle.getHeight());

        rectangle.setRectangle(10, 20);
        System.out.println("Base: " + rectangle.getBase());
        System.out.println("height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        
    }
}
