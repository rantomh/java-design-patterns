package com.rantomah.designpatterns.behavioral.chainofresponsabilty;

public interface Worker {

    void setSubstitute(Worker substitute);

    void handle(Task task);

    boolean isAvailable();
}
