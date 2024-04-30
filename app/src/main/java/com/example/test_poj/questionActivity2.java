package com.example.test_poj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class questionActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);



    }
    public void change_to_incorrect_screen(View v) {
        startActivity(new Intent(questionActivity2.this, incorrect.class));
    }
    public void change_to_question_3(View v)

    {
        startActivity(new Intent(questionActivity2.this, Question3Activity.class));

}

    public void backBtn(View view) {
        startActivity(new Intent(questionActivity2.this, UnitsActivity.class));
    }
}
