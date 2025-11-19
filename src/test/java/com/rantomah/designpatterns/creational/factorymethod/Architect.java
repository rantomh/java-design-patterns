package com.rantomah.designpatterns.creational.factorymethod;

public class Architect implements Interviewer {

    @Override
    public void askQuestions() {
        System.out.println("Asking about software architecture!");
    }
}
