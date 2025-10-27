package com.example.Lergress.Private_Example.Bank;

public class Bank {
    private double balance = 1000.00; // You cannot add or remove as much balance as you want, just depositing or cashing out

    public double getBalance() {
        return balance;
    }

    public double Deposit(double value) {
        return balance += value;
    }

    public double CashOut(double value) {
        return balance -= value;
    }

}