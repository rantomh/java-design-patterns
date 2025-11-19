package com.rantomah.designpatterns.structural.facade;

public class ComputerFacade {

    private final Computer computer;

    public ComputerFacade(Computer computer) {
        this.computer = computer;
    }

    public void turnOn() {
        computer.powerOn();
        computer.runPOST();
        computer.loadOS();
        computer.systemReady();
    }

    public void turnOff() {
        computer.shutdownProcesses();
        computer.enterSleepMode();
        computer.disconnectPower();
    }
}
