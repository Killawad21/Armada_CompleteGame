package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    //This code is for the on click to move to another screen
    public void moveToActivityOne(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void moveToActivityFive(View view){
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }
    //These buttons change the color to block off the defence tokens
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
