package com.example.test_poj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class incorrect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.incorrect);


    }
    public void change_to_unit_screen(View v) {
        startActivity(new Intent(incorrect.this, HighSchoolUnits.class));
    }
}
