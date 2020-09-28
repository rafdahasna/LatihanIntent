package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MoveWithObjectActivity extends AppCompatActivity {

    companion object {
        const val EXTRA_PERSON = "extra_person"
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);

        val tvObject:TextView = findViewById(R.id.tv_object_received)

        val person = intent.getParcelableExtra(EXTRA_PERSON) as Person
        val text = "Name : ${person.name.toString()},\nEmail : ${person.email},\nAge : ${person.age},\nLocation : ${person.city}"
        tvObject.text = text
    }
}