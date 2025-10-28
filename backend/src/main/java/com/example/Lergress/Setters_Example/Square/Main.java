package com.example.Lergress.Setters_Example.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);

        System.out.println("Side: " + square.getSide());
        System.out.println("Area: " + square.getArea());

        square.setSide(-5);

        System.out.println("Side: " + square.getSide());

        square.setSide(10);
        System.out.println("Side: " + square.getSide());
        System.out.println("Area: " + square.getArea());
        
    }
}
