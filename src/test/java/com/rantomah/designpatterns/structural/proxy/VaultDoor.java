package com.rantomah.designpatterns.structural.proxy;

public class VaultDoor implements Door {

    @Override
    public void open() {
        System.out.println("Opening the vault door");
    }

    @Override
    public void close() {
        System.out.println("Closing the vault door");
    }
}
