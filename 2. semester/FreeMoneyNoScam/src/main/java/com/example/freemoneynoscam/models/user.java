package com.example.freemoneynoscam.models;

public class user {
    private int id;
    private String name;
    private String email;

    public user(){}


    public user(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "ID= "+id+"\nname = "+ name + "\nmail = "+email;
    }
}

