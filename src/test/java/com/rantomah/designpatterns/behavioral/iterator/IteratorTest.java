package com.rantomah.designpatterns.behavioral.iterator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class IteratorTest {

    @Test
    void test() {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("A"));
        playlist.addSong(new Song("B"));
        playlist.addSong(new Song("C"));

        Iterator<Song> it = playlist.iterator();

        assertThat(it.hasNext()).isTrue();
        assertThat(it.next().getTitle()).isEqualTo("A");

        assertThat(it.hasNext()).isTrue();
        assertThat(it.next().getTitle()).isEqualTo("B");

        assertThat(it.hasNext()).isTrue();
        assertThat(it.next().getTitle()).isEqualTo("C");

        assertThat(it.hasNext()).isFalse();
    }
}
