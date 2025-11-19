package com.rantomah.designpatterns.behavioral.memento;

public class EditorMemento implements Memento<String> {

    private final String state;

    EditorMemento(String state) { // access only for class in same package
        this.state = state;
    }

    @Override
    public String getState() {
        return state;
    }
}
