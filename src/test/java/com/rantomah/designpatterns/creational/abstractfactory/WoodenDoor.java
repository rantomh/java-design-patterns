package com.rantomah.designpatterns.creational.abstractfactory;

public class WoodenDoor implements Door {

    @Override
    public void getDescription() {
        System.out.println("Door made of wooden");
    }
}
