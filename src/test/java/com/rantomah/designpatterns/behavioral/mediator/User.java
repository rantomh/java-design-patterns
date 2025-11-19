package com.rantomah.designpatterns.behavioral.mediator;

public class User {

    private final String name;
    private final ChatMediator mediator;
    private String lastReceivedMessage;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void joinChat() {
        mediator.register(this);
    }

    public static User create(String name, ChatMediator mediator) {
        User user = new User(name, mediator);
        mediator.register(user);
        return user;
    }

    public void send(String message) {
        mediator.send(name + ": " + message, this);
    }

    public void send(String message, User receiver) {
        mediator.send(message, this, receiver);
    }

    public void receive(String message) {
        this.lastReceivedMessage = message;
    }

    public String getLastReceivedMessage() {
        return lastReceivedMessage;
    }

    public String getName() {
        return name;
    }
}
