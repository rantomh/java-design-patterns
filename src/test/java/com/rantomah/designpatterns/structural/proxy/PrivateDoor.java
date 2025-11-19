package com.rantomah.designpatterns.structural.proxy;

public class PrivateDoor implements Door {

    private final Door door;
    private final String key;

    public PrivateDoor(Door door, String key) {
        this.door = door;
        this.key = key;
    }

    @Override
    public void open() {
        if (authenticate(key)) {
            door.open();
        } else {
            System.out.println("Cannot open this doot without a valid key!");
        }
    }

    @Override
    public void close() {
        door.close();
    }

    private boolean authenticate(String key) {
        return "fez321@#=".equals(key);
    }
}
