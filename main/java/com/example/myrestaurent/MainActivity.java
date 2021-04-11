package com.example.myrestaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void appetizer(View view) {
        Intent ftf=new Intent(MainActivity.this,FastFood.class);
        startActivity(ftf);
    }

    public void mainCourse(View view) {
        Intent bng=new Intent(MainActivity.this,Bangaliana.class);
        startActivity(bng);
    }

    public void about(View view) {
        Intent abt=new Intent(MainActivity.this,About.class);
        startActivity(abt);
    }
}