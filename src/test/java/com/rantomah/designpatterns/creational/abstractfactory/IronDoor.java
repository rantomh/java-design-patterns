package com.rantomah.designpatterns.creational.abstractfactory;

public class IronDoor implements Door {

    @Override
    public void getDescription() {
        System.out.println("Door made of iron");
    }
}
