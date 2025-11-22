package com.rantomah.designpatterns.structural.composite;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CompositeTest {

    @Test
    void test() {
        Developer john = new Developer("John Doe", 12000f);
        Designer jane = new Designer("Jane Doe", 15000f);

        Organization organization = new Organization();
        organization.addEmployee(john);
        organization.addEmployee(jane);

        float total = organization.getNetSalaries();

        assertThat(total).isEqualTo(27000f);
    }
}
