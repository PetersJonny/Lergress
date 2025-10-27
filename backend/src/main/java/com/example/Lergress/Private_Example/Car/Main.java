package com.example.Lergress.Private_Example.Car;

import java.util.Scanner;

@SuppressWarnings("all")

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Scanner scanner = new Scanner(System.in);
        
        String choice = "";

        System.out.println("This is your car: \nModel: " + car.getModel() + ".\nYear: " + car.getCarYear() + ".\nColour: " + car.colour + ".\nAge: " + car.CarAge() + ".");

        System.out.println("You changed the colour of your car? yes/no");

        while(!choice.equals("yes") && !choice.equals("no")) {
            choice = scanner.nextLine();

            if(choice.equals("yes")) {
                System.out.println("What is the new color of the car?");
                String NewCarColour = scanner.nextLine();

                car.ChangeCarColour(NewCarColour);

                System.out.println("Now this is your car: \nModel: " + car.getModel() + ".\nYear: " + car.getCarYear() + ".\nColour: " + car.colour + ".\nAge: " + car.CarAge() + ".");

            } else if(choice.equals("no")){
                break;

            } else {
                System.out.println("This is not a valible response.");
            }

        }
    }
}
