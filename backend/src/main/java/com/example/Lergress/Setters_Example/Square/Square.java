package com.example.Lergress.Setters_Example.Square;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public double getArea() {
        return side * side;
    }

    public Square(double side) {
        this.side = side;
    }

    // set to put de side of the square
    public void setSide(double newSide) {
        if (newSide > 0) {
            side = newSide;
        } else {
            System.out.println("The side cant be zero or you need to put more than zero.");
        }
    }
}
