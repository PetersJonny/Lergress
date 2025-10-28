package com.example.Lergress.Getters_Example.Animal;

public class Animal {
    private String name;
    private String species;
    private String gender;
    private int age;
    private int year = 2025;

    // getters to show the animal info
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, String species, String gender, int age) {
        this.name = name;
        this.species = species;
        this.gender = gender;
        this.age = age;
    }

    public int YearOfBirth() {
        return year - age;
    }

}
