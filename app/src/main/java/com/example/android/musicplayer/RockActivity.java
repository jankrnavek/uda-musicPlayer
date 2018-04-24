package com.example.android.musicplayer;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);



        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Rock song 1","Music group 1",62));
        songs.add(new Song("Rock song 2","Music group 1",59));
        songs.add(new Song("Rock song 3","Music group 1",71));
        songs.add(new Song("Rock song 4","Music group 2",65));
        songs.add(new Song("Rock song 5","Music group 2",115));
        songs.add(new Song("Rock song 6","Music group 2",90));
        songs.add(new Song("Rock song 7","Music group 3",85));
        songs.add(new Song("Rock song 8","Music group 3",79));
        songs.add(new Song("Rock song 9","Music group 3",62));
        songs.add(new Song("Rock song 10","Music group 4",59));
        songs.add(new Song("Rock song 11","Music group 4",71));
        songs.add(new Song("Rock song 12","Music group 4",65));
        songs.add(new Song("Rock song 13","Music group 5",115));
        songs.add(new Song("Rock song 14","Music group 5",90));
        songs.add(new Song("Rock song 15","Music group 5",85));
        songs.add(new Song("Rock song 16","Music group 6",79));
        songs.add(new Song("Rock song 17","Music group 6",79));
        songs.add(new Song("Rock song 18","Music group 6",79));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setBackgroundColor(getResources().getColor(R.color.bg2_color_rock));
        listView.setAdapter(adapter);
    }
}
