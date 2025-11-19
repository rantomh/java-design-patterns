package com.rantomah.designpatterns.behavioral.state;

public class PausedState implements PlayerState {

    @Override
    public void play(Player player) {
        player.setState(new PlayingState());
        System.out.println("Resumed playing");
    }

    @Override
    public void pause(Player player) {
        System.out.println("Already paused");
    }

    @Override
    public void stop(Player player) {
        player.setState(new StoppedState());
        System.out.println("Stopped");
    }

    @Override
    public String getName() {
        return "Paused";
    }
}
