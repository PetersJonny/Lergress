package com.example.Lergress.Getters_Example.Animal;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("lion", "mammal", "male", 10);

        System.out.println("the animal that you chose is " + lion.getName() + ", the species is " + lion.getSpecies() + ", the gender is " + lion.getGender() + " and the age is " + lion.getAge());

        System.out.println("The animal was born in " + lion.YearOfBirth());

    }
}
