package com.example.Lergress.Setters_Example.GamePoints;

public class GamePoints {
    private int points = 0;

    public int getPoints() {
        return points;
    }

    // set to change the pontuation
    public void setPoints(int newPoints) {
        if (newPoints >= 0) {
            points = newPoints;
        } else {
            points = 0;
            System.out.println("Points cant be negative.");
        }
    }
}
