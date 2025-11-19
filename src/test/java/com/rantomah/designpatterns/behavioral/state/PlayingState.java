package com.rantomah.designpatterns.behavioral.state;

public class PlayingState implements PlayerState {

    @Override
    public void play(Player player) {
        System.out.println("Already playing");
    }

    @Override
    public void pause(Player player) {
        player.setState(new PausedState());
        System.out.println("Paused");
    }

    @Override
    public void stop(Player player) {
        player.setState(new StoppedState());
        System.out.println("Stopped");
    }

    @Override
    public String getName() {
        return "Playing";
    }
}
