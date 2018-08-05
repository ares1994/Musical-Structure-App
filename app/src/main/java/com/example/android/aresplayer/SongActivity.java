package com.example.android.aresplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ImageButton homeButton =  findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(SongActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        ImageButton albumButton =  findViewById(R.id.album_button);
        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(SongActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });
        ImageButton artistButton = findViewById(R.id.artist_button);
        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(SongActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        ArrayList<Word> info = new ArrayList<>();
        info.add(new Word("Closer", "The Chainsmokers"));
        info.add(new Word("Everything will be OK", "G-Eazy"));
        info.add(new Word("Fade Away", "Logic"));
        info.add(new Word("Feel Good", "Syn Cole"));
        info.add(new Word("In my Feelings", "Drake"));
        info.add(new Word("Overnight", "Logic"));
        info.add(new Word("Scream", "Michael Jackson"));
        info.add(new Word("Stranger in Moscow", "Michael Jackson"));
        info.add(new Word("Ultrasound", "Joyner Lucas"));
        info.add(new Word("Winter Blues", "Joyner Lucas"));


        SongAdapter adapter = new SongAdapter(this, info);
        ListView listView =  findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
