package com.rantomah.designpatterns.behavioral.command;

import java.util.Stack;

public class CommandHistory {

    private final Stack<Command> commands = new Stack<>();

    public void push(Command command) {
        commands.push(command);
    }

    public Command pop() {
        return commands.pop();
    }

    public boolean isEmpty() {
        return commands.isEmpty();
    }
}
