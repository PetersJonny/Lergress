package com.example.Lergress.This_Example.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 10);

        System.out.println("Base: " + triangle.getBase());
        System.out.println("height: " + triangle.getHeight());
        System.out.println("Area: " + triangle.getArea());

        triangle.setTriangle(-5, 1);

        System.out.println("Base: " + triangle.getBase());
        System.out.println("height: " + triangle.getHeight());

        triangle.setTriangle(10, 20);
        System.out.println("Base: " + triangle.getBase());
        System.out.println("height: " + triangle.getHeight());
        System.out.println("Area: " + triangle.getArea());
    }
}
