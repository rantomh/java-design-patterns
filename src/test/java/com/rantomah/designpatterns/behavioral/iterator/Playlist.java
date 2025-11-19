package com.rantomah.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private final List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public Iterator<Song> iterator() {
        return new PlaylistIterator(this);
    }

    // package-private → pas public
    List<Song> getSongs() {
        return songs;
    }
}
