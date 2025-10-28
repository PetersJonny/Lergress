package com.example.Lergress.Setters_Example.GamePoints;

public class Main {
    public static void main(String[] args) {
        GamePoints character = new GamePoints();

        System.out.println("Starts with " + character.getPoints() + " points");

        character.setPoints(150);
        System.out.println("Now your pontuation: " + character.getPoints());

        character.setPoints(-50);
        System.out.println("Now your pontuation: " + character.getPoints());
    }
}
