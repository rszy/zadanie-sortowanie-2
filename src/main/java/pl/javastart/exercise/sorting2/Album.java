package pl.javastart.exercise.sorting2;

import java.util.Date;
import java.util.List;

public class Album {

    private String title;
    private String artist;
    private Date releaseDate;
    private List<Song> songs;

    public Album(String title, String artist, Date releaseDate, List<Song> songs) {
        this.title = title;
        this.artist = artist;
        this.releaseDate = releaseDate;
        this.songs = songs;
    }

    public String getTitle() {
        return title;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getArtist() {
        return artist;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }
}
