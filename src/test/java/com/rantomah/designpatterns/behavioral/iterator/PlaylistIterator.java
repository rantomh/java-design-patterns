package com.rantomah.designpatterns.behavioral.iterator;

import java.util.List;

public class PlaylistIterator implements Iterator<Song> {

    private final List<Song> songs;
    private int index = 0;

    public PlaylistIterator(Playlist playlist) {
        this.songs = playlist.getSongs();
    }

    @Override
    public boolean hasNext() {
        return index < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(index++);
    }
}
