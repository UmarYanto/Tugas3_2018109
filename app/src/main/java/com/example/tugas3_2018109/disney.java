package com.example.tugas3_2018109;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class disney extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disney);
    }

    public void netflix (View view){
        Intent a = new Intent(disney.this, MainActivity.class);
        startActivity(a);
    }
    public void yt(View view){
        Intent a = new Intent(disney.this, yt.class);
        startActivity(a);
    }
}