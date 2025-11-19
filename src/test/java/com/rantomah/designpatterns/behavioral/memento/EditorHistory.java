package com.rantomah.designpatterns.behavioral.memento;

import java.util.Stack;

public class EditorHistory implements History<String> {

    private final Stack<Memento<String>> states = new Stack<>();

    @Override
    public void push(Memento<String> memento) {
        states.push(memento);
    }

    @Override
    public Memento<String> pop() {
        return states.pop();
    }
}
