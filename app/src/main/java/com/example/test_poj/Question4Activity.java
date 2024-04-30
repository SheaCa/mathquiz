package com.example.test_poj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Question4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
    }
    public void change_to_incorrect_screen(View v) {
        startActivity(new Intent(Question4Activity.this, incorrect.class));
    }
    public void change_to_question_5(View v)

    {
        startActivity(new Intent(Question4Activity.this, Question5Activity.class));
}}