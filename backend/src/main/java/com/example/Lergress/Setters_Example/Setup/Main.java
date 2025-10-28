package com.example.Lergress.Setters_Example.Setup;

public class Main {
    public static void main(String[] args) {
        Setup mySetup = new Setup();

        mySetup.setMouse("Logitech G203");
        mySetup.setKeyBoard("Redragon Kumara K552");
        mySetup.setMicroPhone("Fifine K669");
        mySetup.setMousePad("Mousepad Gamer Large");
        mySetup.setScreen("Screen 24 Full HD (1080p) 75Hz");

        System.out.println("This is your setup: \nMouse: " + mySetup.getMouse() + "\nKeyboard: " + mySetup.getKeyBoard() + "\nMicrophone: " + mySetup.getMicroPhone() +  "\nMousepad: " + mySetup.getMousePad() + "\nScreen: " + mySetup.getScreen());
    }
}
