package com.example.woco;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private DatabaseReference mDatabase;

    public String roomID = "p9it";

    Button createRoom, joinRoom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        removeDataFromDatabase();
// for opening screen 2 from screen 1
        mDatabase = FirebaseDatabase.getInstance().getReference();
        createRoom = (Button)findViewById(R.id.button1_1);

        Button j = findViewById(R.id.button1_2);


        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                joinRoom();
                startActivity(new Intent(MainActivity.this, ScreenTwo.class));
            }

        });


        createRoom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                createRoom();
                Intent toHome = new Intent(view.getContext(), Screen3.class);
                startActivityForResult(toHome, 0);
            }
        });

    }


    private void createRoom() {

        Room room1 = new Room(roomID);
        mDatabase.child("rooms").child(roomID).setValue(room1);

        ValueEventListener roomListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Room room = snapshot.getValue(Room.class);
                // Function to update UI when room changes
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        };
        mDatabase.child("rooms").child(roomID).addValueEventListener(roomListener);

        mDatabase.child("rooms").child(roomID).child("timer").setValue(0);



    }

    private void joinRoom() {


        String roomID = "p9it";

        ValueEventListener roomListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Room room = snapshot.getValue(Room.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        };
        mDatabase.addValueEventListener(roomListener);


    }

    private void removeDataFromDatabase(){
        DatabaseReference root = FirebaseDatabase.getInstance().getReference();
        root.setValue(null);
    }

}