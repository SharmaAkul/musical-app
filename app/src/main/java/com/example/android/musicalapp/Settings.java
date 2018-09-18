package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity {
    Button home;
    Button songs;
    Button playList;
    Button playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        home = (Button) findViewById(R.id.main);
        playList = (Button) findViewById(R.id.playLists);
        playing = (Button) findViewById(R.id.playing);
        songs = (Button) findViewById(R.id.player);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent(Settings.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });

        playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playing = new Intent(Settings.this, NowPlaying.class);
                startActivity(playing);
            }
        });

        playList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playLists = new Intent(Settings.this, PlayList.class);
                startActivity(playLists);
            }
        });

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songs = new Intent(Settings.this, Music.class);
                startActivity(songs);
            }
        });
    }
}
