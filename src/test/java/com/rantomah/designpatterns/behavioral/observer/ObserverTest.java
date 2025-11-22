package com.rantomah.designpatterns.behavioral.observer;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ObserverTest {

    private static final String OUTPUT =
"""
Sending 1000,00 USD via BankTransfer
Sending 1000,00 USD via MobileMoneyTransfer
""";

    @Test
    void test() {
        var output = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(output));

        PayrollSystem payrollSystem = new PayrollSystem();

        payrollSystem.subscribe(new BankTransfer());
        payrollSystem.subscribe(new MobileMoneyTransfer());

        payrollSystem.paySalaries(1000);

        assertThat(output.toString()).isEqualToIgnoringNewLines(OUTPUT);
    }
}
