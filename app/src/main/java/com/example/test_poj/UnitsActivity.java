package com.example.test_poj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UnitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units);
    }

    public void calcQuestions(View view) {
        startActivity(new Intent(UnitsActivity.this, CalcActivity.class));
    }

    public void alg1Btn(View view) {
        startActivity(new Intent(UnitsActivity.this, AlgActivity.class));

    }

    public void geometryBtn(View view) {
        startActivity(new Intent(UnitsActivity.this, Alg3Activity.class));
    }

    public void backBtn(View view) {
        startActivity(new Intent(UnitsActivity.this, MainActivity.class));
    }
}