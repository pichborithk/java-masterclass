package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)){
                return song;
            }
        }

        return null;
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) {
            return false;
        }

        songs.add(new Song(title, duration));
        return true;
    }

    public boolean addToPlayList(int track, LinkedList<Song> list) {
        if (track <= 0 || track > songs.size()) {
            return false;
        }
        var song = songs.get(track -1);
        if (song != null) {
            list.add(song);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> list) {
        var song = findSong(title);
        if (song != null) {
            list.add(song);
            return true;
        }
        return false;
    }
}
