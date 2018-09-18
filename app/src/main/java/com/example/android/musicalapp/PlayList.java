package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class PlayList extends AppCompatActivity {
    Button home;
    Button settings;
    Button songs;
    Button playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);
        ImageView bar = (ImageView) findViewById(R.id.bar);
        ImageView auto = (ImageView) findViewById(R.id.auto);
        ImageView auto1 = (ImageView) findViewById(R.id.auto1);
        home = (Button) findViewById(R.id.main);
        songs = (Button) findViewById(R.id.player);
        playing = (Button) findViewById(R.id.playing);
        settings = (Button) findViewById(R.id.settings);

        bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Info about the current song", Toast.LENGTH_SHORT).show();
            }
        });
        auto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "List of recently Played songs", Toast.LENGTH_SHORT).show();
            }
        });
        auto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "List of recently Played songs", Toast.LENGTH_SHORT).show();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent(PlayList.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });

        playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playing = new Intent(PlayList.this, NowPlaying.class);
                startActivity(playing);
            }
        });

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent music = new Intent(PlayList.this, Music.class);
                startActivity(music);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settings = new Intent(PlayList.this, Settings.class);
                startActivity(settings);
            }
        });
    }
}
