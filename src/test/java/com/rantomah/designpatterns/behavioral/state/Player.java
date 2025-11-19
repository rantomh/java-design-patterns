package com.rantomah.designpatterns.behavioral.state;

public interface Player {

    void setState(PlayerState state);

    void play();

    void pause();

    void stop();
}
