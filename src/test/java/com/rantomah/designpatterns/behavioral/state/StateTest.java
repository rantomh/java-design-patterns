package com.rantomah.designpatterns.behavioral.state;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StateTest {

    @Test
    void test() {
        MusicPlayer player = new MusicPlayer();
        assertThat(player.getState().getName()).isEqualTo("Stopped");

        player.play();
        assertThat(player.getState().getName()).isEqualTo("Playing");

        player.pause();
        assertThat(player.getState().getName()).isEqualTo("Paused");

        player.play();
        assertThat(player.getState().getName()).isEqualTo("Playing");

        player.stop();
        assertThat(player.getState().getName()).isEqualTo("Stopped");
    }
}
