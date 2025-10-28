package com.example.Lergress.Getters_Example.Vocaloid;

public class Main {
    public static void main(String[] args) {
        Vocaloid hatsuneMiku = new Vocaloid("hatsune Miku");
        Vocaloid kaito = new Vocaloid("kaito");
        Vocaloid kagamineLen = new Vocaloid("Kagamine Len");
        Vocaloid kagamineRin = new Vocaloid("Kagamine Rin");
        Vocaloid megurineLuka = new Vocaloid("Megurine Luka");
        Vocaloid meiko = new Vocaloid("Meiko");

        System.out.println("Vocaloids of the world of Hatsune Miku:");
        System.out.println(hatsuneMiku.getName());
        System.out.println(kaito.getName());
        System.out.println(kagamineLen.getName());
        System.out.println(kagamineRin.getName());
        System.out.println(megurineLuka.getName());
        System.out.println(meiko.getName());

    }
}
