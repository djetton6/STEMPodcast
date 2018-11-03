package com.example.android.stempodcast;


//Trying to see where I went wrong by doing the walkthrough then
public class song {
//Custom Song Schema

    private final String artistName;
    private final String artistSong;
    private final int artistImage;
    private final String artistFeatured;

    //Building the constructor and passing through objects we want(Name, Song, Image, and Ft.)
    public song (String artistName, String artistSong, int artistImage, String artistFeatured) {
    //Output of variables that our constructor can use.
        this.artistName = artistName;
        this.artistSong = artistSong;
        this.artistImage = artistImage;
        this.artistFeatured = artistFeatured;

    }

    public String getArtistName() {
        return artistName;
    }

    public String getArtistSong() {
        return artistSong;
    }

    public int getArtistImage() {
        return artistImage;
    }

    public String getArtistFeatured() {
        return artistFeatured;
    }

}
