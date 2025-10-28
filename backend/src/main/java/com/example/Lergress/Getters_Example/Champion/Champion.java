package com.example.Lergress.Getters_Example.Champion;

public class Champion {
    private String name;
    private int currentHp;
    private int maxHp;
    private int damage;

    // getters to show the champion info
    public String getName() {
        return name;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getDamage() {
        return damage;
    }

    public Champion(String name, int currentHp, int damage) {
        this.name = name;
        this.currentHp = currentHp;
        this.maxHp = currentHp;
        this.damage = damage;
    }

    public void takeDamage(int damageAmount) {
        currentHp = currentHp - damageAmount;
        if (currentHp < 0) {
            currentHp = 0;
        }
        System.out.println(name + " take " + damageAmount + " of damage!");
        System.out.println(name + " has " + currentHp + " Hp\n");
    }

}
