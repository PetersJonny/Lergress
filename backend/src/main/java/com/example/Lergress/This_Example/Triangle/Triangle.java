package com.example.Lergress.This_Example.Triangle;

public class Triangle {
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return (base * height) / 2;
    }

    public Triangle(double base, double height) {
        this.base = base; // differentiate class attributes from constructor parameters
        this.height = height; // differentiate class attributes from constructor parameters
    }

    public void setTriangle(double newBase, double newHeight) {
        if (newBase > 0 && newHeight > 0) {
            base = newBase;
            height = newHeight;
        } else {
            System.out.println("The base and height cant be zero or you need to put more than zero.");
        }
    }

}
