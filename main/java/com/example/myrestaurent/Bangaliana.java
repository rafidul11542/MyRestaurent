package com.example.myrestaurent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bangaliana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangaliana);
    }

    public void gotoHome(View view) {
        Intent gt=new Intent(Bangaliana.this,MainActivity.class);
        startActivity(gt);
    }

    public void set1(View view) {
        SetMenu1 smone=new SetMenu1();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame4, smone);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void set2(View view) {
        SetMenu2 smtwo=new SetMenu2();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame4, smtwo);
        ft.addToBackStack(null);
        ft.commit();
    }
}