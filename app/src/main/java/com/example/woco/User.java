package com.example.woco;

import java.util.ArrayList;

public class User {

    public String name;
    public ArrayList<String> todo;

    public User() {

    }

    public User(String name, ArrayList<String> todo) {
        this.name = name;
        this.todo = todo;
    }
}
