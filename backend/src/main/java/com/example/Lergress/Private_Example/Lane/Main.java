package com.example.Lergress.Private_Example.Lane;

import java.util.Scanner;

@SuppressWarnings("all")

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        System.out.println("This is your riot account: \nUsername: " + account.getUsername() + ".");

        System.out.println("What do you whant to do? ");

        do {
            System.out.println("1. Change my username. \n2. Change my password. \n3. See a lane to play. \n4. Exit");
            choice = scanner.nextInt();

            scanner.nextLine();

            if (choice == 1) {
                System.out.println("What username do you whant to put?");
                String newUserName = scanner.nextLine();

                account.ChangeUserName(newUserName);

                System.out.println("Now this is your username: " + account.getUsername());

            } else if (choice == 2) {
                System.out.println("What is your password? ");
                String tryPassword = scanner.nextLine();
                if (tryPassword.equals(account.getPassword())) {
                    System.out.println("What password do you whant to put?");
                    String newPassword = scanner.nextLine();

                    account.ChangePassword(newPassword);

                    System.out.println("This is your new password: " + account.getPassword());
                } else {
                    System.out.println("Wrong password.");
                }
            } else if (choice == 3) {
                account.RandomLane();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("This is not a valid number.");
            }

        } while (choice != 4);
    }
}
