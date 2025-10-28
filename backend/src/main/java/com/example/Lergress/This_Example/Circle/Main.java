package com.example.Lergress.This_Example.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea() + "pi");

        circle.setRadius(-2);

        System.out.println("Radius: " + circle.getRadius());

        circle.setRadius(10);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea() + "pi");

    }
}
