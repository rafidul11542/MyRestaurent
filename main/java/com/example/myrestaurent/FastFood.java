package com.example.myrestaurent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FastFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food);
    }

    public void burger(View view) {
        Burger bg=new Burger();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame1, bg);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void pizza(View view) {
        Pizza pz=new Pizza();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame1, pz);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void goHome(View view) {
        Intent ghm=new Intent(FastFood.this,MainActivity.class);
        startActivity(ghm);
    }

    public void sndwich(View view) {
        Sandwich sn=new Sandwich();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame2, sn);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void chicken(View view) {
        Chicken ck=new Chicken();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame2, ck);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void sup(View view) {
        Soup sp=new Soup();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame3, sp);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void stek(View view) {
        Steak st=new Steak();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame3, st);
        ft.addToBackStack(null);
        ft.commit();
    }
}