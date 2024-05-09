package com.example.test_poj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Alg3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alg3);
    }
    public void change_to_incorrect_screen(View v) {
        startActivity(new Intent(Alg3Activity.this, incorrect.class));
    }
    public void change_to_question_4(View v) {
        startActivity(new Intent(Alg3Activity.this, Question4Activity.class));
    }

    public void backBtn(View view) {
        startActivity(new Intent(Alg3Activity.this, UnitsActivity.class));
    }
}