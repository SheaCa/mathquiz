package com.example.test_poj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alg);
    }

    public void incorrectScreen(View view) {
        startActivity(new Intent(AlgActivity.this, incorrect.class));
    }

    public void question2(View view) {
        startActivity(new Intent(AlgActivity.this, Alg2Activity.class));
    }

    public void backBtn(View view) {
        startActivity(new Intent(AlgActivity.this, UnitsActivity.class));
    }
}