package com.rantomah.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomMediator implements ChatMediator {

    private final List<User> users = new ArrayList<>();

    @Override
    public void register(User user) {
        users.add(user);
    }

    @Override
    public void send(String message, User sender) {
        users.stream().filter(u -> u != sender).forEach(u -> u.receive(message));
    }

    @Override
    public void send(String message, User sender, User receiver) {
        receiver.receive("[PRIVATE] " + sender.getName() + ": " + message);
    }
}
