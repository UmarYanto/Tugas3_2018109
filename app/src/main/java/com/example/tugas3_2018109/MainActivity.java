package com.example.tugas3_2018109;

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

    public void yt(View view){
        Intent a = new Intent(MainActivity.this, yt.class);
        startActivity(a);
    }
    public void disney (View view){
        Intent a = new Intent(MainActivity.this, disney.class);
        startActivity(a);
    }

    public void netflix(View view) {
    }
}