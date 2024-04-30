package com.example.test_poj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
    }
    public void change_to_incorrect_screen(View v) {
        startActivity(new Intent(ActivityQuestion.this, incorrect.class));
    }
    public void change_to_question_2(View v)

    {
        startActivity(new Intent(ActivityQuestion.this, questionActivity2.class));
    }


    public void backBtn(View view) {
        startActivity(new Intent(ActivityQuestion.this, MainActivity.class));
    }
}

