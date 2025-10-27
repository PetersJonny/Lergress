package com.example.Lergress.Private_Example.Lane;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Account {

    private String username = "MainPeter"; // Username is private because you only can change if you chose to change
    private String password = "Peter123"; // Password is private because you only can change if you chose to change

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void RandomLane() {
        List<String> lane = new ArrayList<>();
        Random random = new Random();

        lane.add("Top");
        lane.add("Jungle");
        lane.add("Mid");
        lane.add("Adc");
        lane.add("Sup");

        int randomIndex = random.nextInt(lane.size());

        String randomLane = lane.get(randomIndex);

        System.out.println("Your lane is: " + randomLane);
    }

    public void ChangeUserName(String newUserName) {
        username = newUserName;
    }

    public void ChangePassword(String newPassword) {
        password= newPassword;
    }

}
