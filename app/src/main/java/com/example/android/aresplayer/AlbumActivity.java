package com.example.android.aresplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ImageButton homeButton =  findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(AlbumActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
        ImageButton songButton =  findViewById(R.id.song_button);
        songButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(AlbumActivity.this, SongActivity.class);
                startActivity(songIntent);
            }
        });
        ImageButton artistButton =  findViewById(R.id.artist_button);
        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(AlbumActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });


        ArrayList<String> info = new ArrayList<>();
        info.add("508-507-2209");
        info.add("Bobby Tartantino II");
        info.add("Closer-Single");
        info.add("Feel Good-Single");
        info.add("History");
        info.add("Scorpion");
        info.add("The Incredible True Story");
        info.add("When it's Dark Out");


        InfoAdapter adapter = new InfoAdapter(this, info);
        ListView listView =  findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
