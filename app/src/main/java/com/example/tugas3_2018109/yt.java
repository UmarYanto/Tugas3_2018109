package com.example.tugas3_2018109;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class yt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yt);
    }

    public void netflix (View view){
        Intent a = new Intent(yt.this, MainActivity.class);
        startActivity(a);
    }
    public void disney (View view){
        Intent b = new Intent(yt.this, disney.class);
        startActivity(b);
    }
}