package com.kodilla;

public class User {

    private String firstname;
    private String lastname;
    private String password;

    public User(String firstname, String lastname, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
    }

    public void printUserData(){
        System.out.println(firstname + ", " + lastname + ", " + password);
    }
}
