package com.rantomah.designpatterns.creational.factorymethod;

public abstract class HiringManager {

    protected abstract Interviewer makeInterviewer();

    public void takeInterview() {
        Interviewer interviewer = makeInterviewer();
        interviewer.askQuestions();
    }
}
