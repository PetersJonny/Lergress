package com.example.Lergress.Private_Example.Bank;

import java.util.Scanner;

@SuppressWarnings("all")

public class Main {

    public static void main(String[] args) {
        
        Bank bk = new Bank();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        double value = 0;

        do {
            System.out.println("What do you want to do?");
            System.out.println("1. See my balance. \n2. Deposit. \n3. Cash out. \n4. Exit.");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("This is your balance: " + bk.getBalance());
            } else if (choice == 2) {
                System.out.println("How much do you wnat to deposit?");
                value = scanner.nextDouble();

                bk.Deposit(value);

                System.out.println("Now this is your balance: " + bk.getBalance());
            } else if(choice == 3) {
                System.out.println("How much do you wnat to cash out?");
                value = scanner.nextDouble();

                if (value <= bk.getBalance()) {
                
                    bk.CashOut(value);

                    System.out.println("Now this is your balance: " + bk.getBalance());
                } else {
                    System.out.println("You dont have this balance.");
                }
            }

            if (choice > 4 || choice < 1) {
                System.out.println("is not a valid number.");
            }

        } while (choice != 4);

    }
}
