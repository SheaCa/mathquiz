package com.example.test_poj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Question7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);
    }
    public void change_to_incorrect_screen(View v) {
        startActivity(new Intent(Question7Activity.this, incorrect.class));
    }
    public void change_to_correct_screen(View v)

    {
        startActivity(new Intent(Question7Activity.this, correctScreen.class));
}}