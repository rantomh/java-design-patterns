package com.rantomah.designpatterns.behavioral.state;

public class StoppedState implements PlayerState {

    @Override
    public void play(Player player) {
        player.setState(new PlayingState());
        System.out.println("Started playing");
    }

    @Override
    public void pause(Player player) {
        System.out.println("Already stopped, cannot pause");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Already stopped");
    }

    @Override
    public String getName() {
        return "Stopped";
    }
}
