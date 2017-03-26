package com.hackingbuzz.firebaseseries5database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        // Write a message to the database
        // its a object of root directory ( / )  you can also assume this,,
        FirebaseDatabase database = FirebaseDatabase.getInstance();

        // DatabaseReference --> refer to the child in root directory ( / ) // fireapp-494a3   in Linux type file system

        // this is the one way to create child..
        DatabaseReference myRef = database.getReference("message");
        myRef.setValue("Hello, World!");

    // this is the another way to create child..
        DatabaseReference myRef2 = database.getReference().child("Email");
        myRef2.setValue("myemail@gmail.com");*/




        // this is the more shorter way to do all the process.....
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        myRef.child("Amazon").setValue("All in One Store");
        myRef.child("Myntra").setValue("Clothes Store");




    }
}
