package com.rantomah.designpatterns.behavioral.state;

public interface PlayerState {

    void play(Player player);

    void pause(Player player);

    void stop(Player player);

    String getName();
}
