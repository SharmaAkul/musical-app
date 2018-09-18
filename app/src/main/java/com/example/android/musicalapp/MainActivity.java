package com.example.android.musicalapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView nowPlaying;
    ImageView playList;
    ImageView music;
    ImageView settings;
    ImageView payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 /*----------------------------------------------------------------------------------------------
    # This open the Now Playing Activity
  -----------------------------------------------------------------------------------------------*/
        nowPlaying = (ImageView) findViewById(R.id.nowPlaying);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlaying = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(nowPlaying);
            }
        });
/*----------------------------------------------------------------------------------------------
    # This open the Play List Activity
  -----------------------------------------------------------------------------------------------*/
        playList = (ImageView) findViewById(R.id.playList);
        playList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playList = new Intent(MainActivity.this, PlayList.class);
                startActivity(playList);
            }
        });
 /*----------------------------------------------------------------------------------------------
    # This open the Music Activity
  -----------------------------------------------------------------------------------------------*/
        music = (ImageView) findViewById(R.id.music);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent music = new Intent(MainActivity.this, Music.class);
                startActivity(music);
            }
        });
   /*----------------------------------------------------------------------------------------------
    # This open the Setting Activity
  -----------------------------------------------------------------------------------------------*/
        settings = (ImageView) findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settings = new Intent(MainActivity.this, Settings.class);
                startActivity(settings);
            }
        });

        payment = (ImageView) findViewById(R.id.payment);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent payment = new Intent(MainActivity.this, PaymentActivity.class);
                startActivity(payment);
            }
        });
    }
}
