package com.rantomah.designpatterns.behavioral.chainofresponsabilty;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ChainOfResponsabilityTest {

    @Test
    void test() {
        Director director = new Director();
        director.setAvailable(false);

        DeputyDirector deputy = new DeputyDirector();
        deputy.setAvailable(false);

        SecretaryGeneral secretary = new SecretaryGeneral();

        director.setSubstitute(deputy);
        deputy.setSubstitute(secretary);

        Task task = new Task("Sign contract");

        director.handle(task);

        assertThat(task.isDone()).isTrue();
    }
}
