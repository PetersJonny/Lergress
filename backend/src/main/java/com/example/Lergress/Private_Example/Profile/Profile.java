package com.example.Lergress.Private_Example.Profile;

public class Profile {
    private final String fullName = "Pedro Da Silva"; // The full name must not be changed
    public String username = "Peters"; // The username its the only who the user can change
    private final String email = "pedro@gmail.com"; // The email must not be changed
    private final String password = "Pedro123"; // The password must not be changed

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void ChangeUsername(String changeUsername) {
        changeUsername = username;
    }

}
