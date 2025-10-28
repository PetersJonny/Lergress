package com.example.Lergress.Getters_Example.Champion;

import java.util.Scanner;

@SuppressWarnings("all")

public class Main {
    public static void main(String[] args) {
        Champion samira = new Champion("samira", 700, 100);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Champion: " + samira.getName() + "\nHp: " + samira.getCurrentHp() + "\nDamage: " + samira.getDamage() + "\n");

        samira.takeDamage(400);

        samira.takeDamage(400);

    }
}
