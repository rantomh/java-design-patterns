package com.rantomah.designpatterns.behavioral.mediator;

public interface ChatMediator {

    void send(String message, User sender);

    void send(String message, User sender, User receiver);

    void register(User user);
}
