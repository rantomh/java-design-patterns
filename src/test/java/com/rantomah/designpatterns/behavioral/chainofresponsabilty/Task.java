package com.rantomah.designpatterns.behavioral.chainofresponsabilty;

public class Task {

    private final String description;

    private boolean done;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
