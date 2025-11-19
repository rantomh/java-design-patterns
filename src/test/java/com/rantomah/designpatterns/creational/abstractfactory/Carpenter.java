package com.rantomah.designpatterns.creational.abstractfactory;

public class Carpenter implements DoorFittingExpert {

    @Override
    public void getDescription() {
        System.out.println("Person who performs carpentry jobs");
    }
}
