package com.rantomah.designpatterns.creational.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    void test() {
        President president1 = President.getInstance();
        President president2 = President.getInstance();

        Assertions.assertThat(president1).isSameAs(president2);
    }
}
