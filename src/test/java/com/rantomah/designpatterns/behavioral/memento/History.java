package com.rantomah.designpatterns.behavioral.memento;

public interface History<T> {

    void push(Memento<T> memento);

    Memento<T> pop();
}
