package com.example.android.musicplayer;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView jazzView = (TextView) findViewById(R.id.jazz);

        jazzView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(MainActivity.this, JazzActivity.class);
                startActivity(i);
            }
        });

        TextView rockView = (TextView) findViewById(R.id.rock);

        rockView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(MainActivity.this, RockActivity.class);
                startActivity(i);
            }
        });

        TextView reggaeView = (TextView) findViewById(R.id.reggae);

        reggaeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(MainActivity.this, ReggaeActivity.class);
                startActivity(i);
            }
        });

        TextView funkyView = (TextView) findViewById(R.id.funky);

        funkyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(MainActivity.this, FunkyActivity.class);
                startActivity(i);
            }
        });

    }
}
