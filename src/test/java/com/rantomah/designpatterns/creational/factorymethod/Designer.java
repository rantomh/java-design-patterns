package com.rantomah.designpatterns.creational.factorymethod;

public class Designer implements Interviewer {

    @Override
    public void askQuestions() {
        System.out.println("Asking about web design!");
    }
}
