package com.example.demo;

public class Song {
    private long id;
    private String name;
    private String artist;
    private String album;
    private int rating;
    private int year;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
