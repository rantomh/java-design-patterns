package com.rantomah.designpatterns.structural.facade;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FacadeTest {

    private static final String OUTPUT =
"""
Powering on the motherboard and initializing CPU...
Running POST (Power-On Self-Test)...
Loading the operating system...
System is ready for use.
Shutting down all processes...
Entering sleep mode...
Power supply disconnected!
""";

    @Test
    void test() {
        var output = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(output));

        ComputerFacade computerFacade = new ComputerFacade(new Computer());
        computerFacade.turnOn();
        computerFacade.turnOff();

        assertThat(output.toString()).isEqualToIgnoringNewLines(OUTPUT);
    }
}
