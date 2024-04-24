package com.example.test_poj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
public class HighSchoolUnits extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_school_units);
    }

    public void alg1btn(View v) {
        startActivity(new Intent(HighSchoolUnits.this, ActivityQuestion.class));

    }

    public void backbtn(View v) {
        startActivity(new Intent(HighSchoolUnits.this, MainActivity.class));

    }

    public void CalcQuestions(View v) {
        startActivity(new Intent(HighSchoolUnits.this, HighSchoolUnits.class));

    }
}
