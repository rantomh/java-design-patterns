package com.rantomah.designpatterns.structural.proxy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ProxyTest {

    private static final String OUTPUT =
"""
Cannot open this doot without a valid key!
Opening the vault door
Closing the vault door
""";

    @Test
    void test() {
        var output = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(output));

        Door door1 = new PrivateDoor(new VaultDoor(), "123456789");
        door1.open();

        Door door2 = new PrivateDoor(new VaultDoor(), "fez321@#=");
        door2.open();
        door2.close();

        assertThat(output.toString()).isEqualToIgnoringNewLines(OUTPUT);
    }
}
