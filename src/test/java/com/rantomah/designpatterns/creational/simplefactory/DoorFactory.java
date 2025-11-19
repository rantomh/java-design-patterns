package com.rantomah.designpatterns.creational.simplefactory;

public class DoorFactory {

    private DoorFactory() {}

    public static Door makeDoor(float width, float height) {
        return new WoodenDoor(width, height);
    }
}
