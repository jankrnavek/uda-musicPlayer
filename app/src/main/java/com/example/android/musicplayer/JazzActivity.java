package com.example.android.musicplayer;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class JazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Jazz song 1","Music group 1",62));
        songs.add(new Song("Jazz song 2","Music group 1",59));
        songs.add(new Song("Jazz song 3","Music group 1",71));
        songs.add(new Song("Jazz song 4","Music group 2",65));
        songs.add(new Song("Jazz song 5","Music group 2",115));
        songs.add(new Song("Jazz song 6","Music group 2",90));
        songs.add(new Song("Jazz song 7","Music group 3",85));
        songs.add(new Song("Jazz song 8","Music group 3",79));
        songs.add(new Song("Jazz song 9","Music group 3",62));
        songs.add(new Song("Jazz song 10","Music group 4",59));
        songs.add(new Song("Jazz song 11","Music group 4",71));
        songs.add(new Song("Jazz song 12","Music group 4",65));
        songs.add(new Song("Jazz song 13","Music group 5",115));
        songs.add(new Song("Jazz song 14","Music group 5",90));
        songs.add(new Song("Jazz song 15","Music group 5",85));
        songs.add(new Song("Jazz song 16","Music group 6",79));
        songs.add(new Song("Jazz song 17","Music group 6",79));
        songs.add(new Song("Jazz song 18","Music group 6",79));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setBackgroundColor(getResources().getColor(R.color.bg2_color_jazz));
        listView.setAdapter(adapter);
    }
}
