package com.rantomah.designpatterns.structural.proxy;

import org.junit.jupiter.api.Test;

public class ProxyTest {

    @Test
    public void test() {
        Door door1 = new PrivateDoor(new VaultDoor(), "123456789");
        door1.open();

        Door door2 = new PrivateDoor(new VaultDoor(), "fez321@#=");
        door2.open();
        door2.close();
    }
}
