package com.example.woco;

import java.util.ArrayList;

public class Room {
    public String id;
    public int time;

    public Room() {

    }

    public Room(String id) {
        this.id = id;
        this.time = 0;
    }

    public void setTimer(int time) {
        this.time = time;
    }

}
