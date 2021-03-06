package com.example.android.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentSong.getName());

        TextView groupTextView = (TextView) listItemView.findViewById(R.id.group);
        groupTextView.setText(currentSong.getGroup());

        TextView durationTextView = (TextView) listItemView.findViewById(R.id.duration);
        durationTextView.setText(currentSong.getDuration());

        return listItemView;
    }

}
