package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity {
    Button home;
    Button settings;
    Button songs;
    Button playlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        ImageView back = (ImageView) findViewById(R.id.back);
        ImageView play = (ImageView) findViewById(R.id.play);
        ImageView forward = (ImageView) findViewById(R.id.forward);
        home = (Button) findViewById(R.id.main);
        songs = (Button) findViewById(R.id.player);
        playlist = (Button) findViewById(R.id.playLists);
        settings = (Button) findViewById(R.id.settings);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Goes to the previous song", Toast.LENGTH_SHORT).show();
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Pause or resume the current  song", Toast.LENGTH_SHORT).show();
            }
        });
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Goes to the next song", Toast.LENGTH_SHORT).show();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent(NowPlaying.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playList = new Intent(NowPlaying.this, PlayList.class);
                startActivity(playList);
            }
        });

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent music = new Intent(NowPlaying.this, Music.class);
                startActivity(music);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settings = new Intent(NowPlaying.this, Settings.class);
                startActivity(settings);
            }
        });
    }
}
