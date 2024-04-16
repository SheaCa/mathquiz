package com.example.test_poj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class MainActivity extends AppCompatActivity{
       @Override
       protected void onCreate(Bundle savedInstanceState) {
              super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_main);
       }

       void change_to_unit_screen(View v) {
              startActivity(new Intent(MainActivity.this, highSchoolUnits.class));
       }
}