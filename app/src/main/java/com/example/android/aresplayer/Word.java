package com.example.android.aresplayer;

public class Word {
    private String mSongName;
    private String mArtistName;

    public Word(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
    }

    //Get default translation of the word
    public String getSongName() {
        return mSongName;
    }

    //Get miwok translation of the word
    public String getArtistName() {
        return mArtistName;
    }
}
