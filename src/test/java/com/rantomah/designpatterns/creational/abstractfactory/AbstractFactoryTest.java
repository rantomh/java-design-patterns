package com.rantomah.designpatterns.creational.abstractfactory;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Test;

class AbstractFactoryTest {

    @Test
    void test() {
        DoorFactory woodenFactory = new WoodenDoorFactory();

        Door woodenDoor = woodenFactory.makeDoor();
        DoorFittingExpert carpenter = woodenFactory.makeFittingExpert();

        assertThatCode(woodenDoor::getDescription).doesNotThrowAnyException();
        assertThatCode(carpenter::getDescription).doesNotThrowAnyException();

        DoorFactory ironFactory = new IronDoorFactory();

        Door ironDoor = ironFactory.makeDoor();
        DoorFittingExpert welder = ironFactory.makeFittingExpert();

        assertThatCode(ironDoor::getDescription).doesNotThrowAnyException();
        assertThatCode(welder::getDescription).doesNotThrowAnyException();
    }
}
