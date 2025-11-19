package com.rantomah.designpatterns.structural.facade;

import org.junit.jupiter.api.Test;

public class FacadeTest {

    @Test
    public void test() {
        ComputerFacade computerFacade = new ComputerFacade(new Computer());
        computerFacade.turnOn();
        computerFacade.turnOff();
    }
}
