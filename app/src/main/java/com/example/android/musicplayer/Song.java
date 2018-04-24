package com.example.android.musicplayer;

public class Song {

    private String mName;
    private String mGroup;
    private int mDuration;

    public Song(String name, String group, int duration) {
        this.mGroup = group;
        this.mName = name;
        this.mDuration = duration;
    }

    public String getGroup() {
        return mGroup;
    }

    public String getName() {
        return mName;
    }

    public String getDuration() {

        int hours = mDuration / 3600;
        int minutes = (mDuration % 3600) / 60;
        int seconds = (mDuration % 3600) % 60;

        return "( " + minutes + ":" + seconds + " sec )";
//        return DateUtils.formatElapsedTime(long);
    }
}
