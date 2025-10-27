package com.example.Lergress.Private_Example.Car;

public class Car {
    private final String model = "Audi R8"; // Its private and final because you cant change the model
    private final int carYear = 2007; // Its private and final because you cant change the  car year
    public String colour = "white";
    private final int year = 2025; // Its private and final because you cant change the year

    public String getModel() {
        return model;
    }

    public int getCarYear() {
        return carYear;
    }

    public int CarAge () {
        return year - carYear;
    }

    public void ChangeCarColour (String newColour) {
        colour = newColour;
    }
}
