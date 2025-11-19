package com.rantomah.designpatterns.creational.factorymethod;

public class MarketingManager extends HiringManager {

    @Override
    protected Interviewer makeInterviewer() {
        return new Designer();
    }
}
