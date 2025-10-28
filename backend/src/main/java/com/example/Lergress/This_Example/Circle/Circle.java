package com.example.Lergress.This_Example.Circle;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius;
    }

    public Circle(double radius) {
        this.radius = radius; // differentiate class attributes from constructor parameters
    }

    public void setRadius(double newRadius) {
        if (newRadius > 0) {
            radius = newRadius;
        } else {
            System.out.println("The radius cant be zero or you need to put more than zero.");
        }
    }

}
