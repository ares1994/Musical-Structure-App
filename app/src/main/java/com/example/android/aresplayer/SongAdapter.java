package com.example.android.aresplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.aresplayer.R;
import com.example.android.aresplayer.Word;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Word> {
    SongAdapter(Activity context, ArrayList<Word> info) {
        super(context, 0, info);
    }

    @Override
    @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.info_text_view);
        songNameTextView.setText(currentWord.getSongName());
        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.info2_text_view);
        artistNameTextView.setText(currentWord.getArtistName());

        return listItemView;
    }

}
