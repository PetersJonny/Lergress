package com.example.Lergress.Setters_Example.AudioConfig;

@SuppressWarnings("all")

public class main {
    public static void main(String[] args) {
        AudioConfig pc = new AudioConfig();

        System.out.println("Volume: " + pc.getVolume());

        pc.setVolume(80);
        System.out.println("Volume: " + pc.getVolume());

        pc.setVolume(120);
        System.out.println("Volume: " + pc.getVolume());

        pc.setVolume(-20);
        System.out.println("Volume: " + pc.getVolume());

    }
}
