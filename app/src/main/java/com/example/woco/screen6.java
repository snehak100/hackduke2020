package com.example.woco;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class screen6 extends AppCompatActivity {

    Button buttonAddUser;
    TextView username, todo;
    private DatabaseReference mDatabase;
    public String roomID = "p9it";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen6);
        mDatabase = FirebaseDatabase.getInstance().getReference();

        buttonAddUser = (Button)findViewById(R.id.button6);
        username = (TextView)findViewById(R.id.textInputEditText);
        todo = (TextView)findViewById(R.id.textInputEditText2);

        buttonAddUser.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mDatabase.child("rooms").child(roomID).orderByChild("users").equalTo((String) username.getText()).addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.exists()){
                            mDatabase.child("rooms").child(roomID).child("users").child((String) username.getText()).child("todo").child((String) todo.getText()).setValue(todo.getText());
                        }
                        else {
                            String name = (String) username.getText();
                            User person = new User(name);
                            mDatabase.child("rooms").child(roomID).child("users").child(name).setValue(person);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                startActivity(new Intent(view.getContext(), Screen3.class));

            }
        });
    }

    private void createUser(String name) {
        User user = new User(name);

        mDatabase.child("rooms").child(roomID).child("users").child(name).setValue(user);
    }

}