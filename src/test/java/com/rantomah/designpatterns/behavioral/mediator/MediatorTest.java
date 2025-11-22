package com.rantomah.designpatterns.behavioral.mediator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    public void test() {
        ChatMediator mediator = new ChatRoomMediator();

        final String senderName = "Alice";

        User alice = User.create(senderName, mediator);
        User bob = User.create("Bob", mediator);
        User charlie = User.create("Charlie", mediator);

        final String broadcastMessage = "Hello guys!";
        final String privateMessage = "Hello Bob";

        alice.send(broadcastMessage);
        alice.send(privateMessage, bob);

        assertThat(charlie.getLastReceivedMessage())
                .isEqualTo(String.format("%s: %s", senderName, broadcastMessage));
        assertThat(bob.getLastReceivedMessage())
                .isEqualTo(String.format("[PRIVATE] %s: %s", senderName, privateMessage));
        assertThat(alice.getLastReceivedMessage()).isNull();
    }
}
