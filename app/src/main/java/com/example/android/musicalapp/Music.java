package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Music extends AppCompatActivity {

    Button home;
    Button settings;
    Button playList;
    Button playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        home = (Button) findViewById(R.id.main);
        playList = (Button) findViewById(R.id.playLists);
        playing = (Button) findViewById(R.id.playing);
        settings = (Button) findViewById(R.id.settings);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent(Music.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });

        playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playing = new Intent(Music.this, NowPlaying.class);
                startActivity(playing);
            }
        });

        playList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playLists = new Intent(Music.this, PlayList.class);
                startActivity(playLists);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settings = new Intent(Music.this, Settings.class);
                startActivity(settings);
            }
        });
    }
}
