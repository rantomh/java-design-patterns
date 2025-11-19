package com.rantomah.designpatterns.creational.abstractfactory;

public class Welder implements DoorFittingExpert {

    @Override
    public void getDescription() {
        System.out.println("Person who performs welding jobs");
    }
}
