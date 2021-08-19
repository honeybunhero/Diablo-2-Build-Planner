package com.example.diablo2buildplanner;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements classButtons.ClassButtons {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void OnAmazonClick(View v) {
        Toast.makeText(this, "Amazon", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnAssassinClick(View v) {
        Toast.makeText(this, "Assassin", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnBarbarianClick(View v) {
        Toast.makeText(this, "Barbarian", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnDruidClick(View v) {
        Toast.makeText(this, "Druid", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnNecromancerClick(View v) {
        Toast.makeText(this, "Necromancer", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnPaladinClick(View v) {
        Toast.makeText(this, "Paladin", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void OnSorceressClick(View v) {
        Intent sorceress = new Intent(this, Sorceress.class);
        loadIntent(sorceress);
    }

    void loadIntent(Intent intent){
        startActivity(intent);
    }
}