package com.rantomah.designpatterns.behavioral.state;

public class MusicPlayer implements Player {

    private PlayerState state;

    public MusicPlayer() {
        this.state = new StoppedState(); // initial state
    }

    @Override
    public void setState(PlayerState state) {
        this.state = state;
    }

    public PlayerState getState() {
        return state;
    }

    @Override
    public void play() {
        state.play(this);
    }

    @Override
    public void pause() {
        state.pause(this);
    }

    @Override
    public void stop() {
        state.stop(this);
    }
}
