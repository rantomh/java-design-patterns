package com.rantomah.designpatterns.creational.simplefactory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class SimpleFactoryTest {

    @Test
    public void test() {
        Door door = DoorFactory.makeDoor(100, 200);
        assertThat(door.getWidth()).isEqualTo(100);
        assertThat(door.getHeight()).isEqualTo(200);

        Door door2 = DoorFactory.makeDoor(50, 100);
        assertThat(door2.getWidth()).isEqualTo(50);
        assertThat(door2.getHeight()).isEqualTo(100);
    }
}
