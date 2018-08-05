package com.example.android.aresplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ImageButton homeButton = (ImageButton) findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(ArtistActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        ImageButton songButton = (ImageButton) findViewById(R.id.song_button);
        songButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(ArtistActivity.this, SongActivity.class);
                startActivity(songIntent);
            }
        });
        ImageButton albumButton = (ImageButton) findViewById(R.id.album_button);
        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(ArtistActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        ArrayList<String> info = new ArrayList<String>();
        info.add("Drake");
        info.add("G-Eazy");
        info.add("Joyner Lucas");
        info.add("Logic");
        info.add("Michael Jackson");
        info.add("Syn Cole");
        info.add("The Chainsmokers");


        InfoAdapter adapter = new InfoAdapter(this, info);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
