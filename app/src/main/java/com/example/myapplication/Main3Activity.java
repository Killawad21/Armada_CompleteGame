package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
public class Main3Activity extends AppCompatActivity {
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void moveToActivityTwo(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
    public void changeToRed(View view){
        findViewById(R.id.first_change).setBackgroundColor(Color.RED);
    }
    public void changeToRed2(View view){
        findViewById(R.id.second_change).setBackgroundColor(Color.RED);
    }
    public void changeToRed3(View view){
        findViewById(R.id.third_change).setBackgroundColor(Color.RED);
    }
}
