package com.rantomah.designpatterns.creational.factorymethod;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class FactoryMethodTest {

    @Test
    public void test() {

        HiringManager devManager = new DevelopmentManager();
        Interviewer devInterviewer = devManager.makeInterviewer();
        devManager.makeInterviewer(); // Asking about software architecture!
        assertThat(devInterviewer).isInstanceOf(Architect.class);

        HiringManager marketingManager = new MarketingManager();
        Interviewer marketingInterviewer = marketingManager.makeInterviewer();
        marketingManager.makeInterviewer(); // Asking about web design!
        assertThat(marketingInterviewer).isInstanceOf(Designer.class);
    }
}
