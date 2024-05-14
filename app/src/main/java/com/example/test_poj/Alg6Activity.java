package com.example.test_poj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Alg6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alg6);
    }
    public void change_to_incorrect_screen(View v) {
        startActivity(new Intent(Alg6Activity.this, incorrect.class));
    }
    public void change_to_question_7(View v)

    {
        startActivity(new Intent(Alg6Activity.this, Alg7Activity.class));
}}