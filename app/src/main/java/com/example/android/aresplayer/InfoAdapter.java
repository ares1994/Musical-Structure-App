package com.example.android.aresplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.aresplayer.R;

import java.util.ArrayList;


public class InfoAdapter extends ArrayAdapter<String> {

    InfoAdapter(Activity context, ArrayList<String> info){
        super(context,0,info);

    }

    @Override
    @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        String currentInfo = getItem(position);

        TextView infoTextView =  convertView.findViewById(R.id.info_text_view);
        infoTextView.setText(currentInfo);

        return convertView;

    }
}
