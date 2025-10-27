package com.example.Lergress.Private_Example.Profile;
import java.util.Scanner;

@SuppressWarnings("all")

public class Main {
    public static void main(String[] args) {
        Profile user = new Profile();
        Scanner scanner = new Scanner(System.in);

         String choice = "";

        System.out.println("Your password, email and full name are kept private for security reasons and cannot be changed, this is your username: " + user.username + ", your full name: " + user.getFullName() + ", email: " + user.getEmail() + " and your password: " + user.getPassword());

        while (!choice.equals("yes") && !choice.equals("no")) {
            System.out.println("Do you want to change your username? yes/no");
            choice = scanner.nextLine();

            if (choice.equals("yes")) {
                System.out.println("Write the new username: ");
                user.username = scanner.nextLine();

                user.ChangeUsername(user.username);

                System.out.println("Your new username is " + user.username);
            } else {
                System.out.println("This is not a choice.");
            }
        }
    }
}
