package com.rantomah.designpatterns.creational.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void test() {
        President president1 = President.getInstance();
        President president2 = President.getInstance();

        Assertions.assertThat(president1).isSameAs(president2);
    }
}
