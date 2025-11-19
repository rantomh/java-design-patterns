package com.rantomah.designpatterns.structural.facade;

public class Computer {

    public void powerOn() {
        System.out.println("Powering on the motherboard and initializing CPU...");
    }

    public void runPOST() {
        System.out.println("Running POST (Power-On Self-Test)...");
    }

    public void loadOS() {
        System.out.println("Loading the operating system...");
    }

    public void systemReady() {
        System.out.println("System is ready for use.");
    }

    public void shutdownProcesses() {
        System.out.println("Shutting down all processes...");
    }

    public void enterSleepMode() {
        System.out.println("Entering sleep mode...");
    }

    public void disconnectPower() {
        System.out.println("Power supply disconnected!");
    }
}
