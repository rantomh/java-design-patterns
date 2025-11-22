package com.rantomah.designpatterns.creational.builder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BuilderTest {

    @Test
    void test() {
        Burger burger =
                new BurgerBuilder()
                        .size(2)
                        .cheese(true)
                        .pepperoni(true)
                        .lettuce(true)
                        .tomato(true)
                        .build();

        Assertions.assertThat(burger.getSize()).isEqualTo(2);
        Assertions.assertThat(burger.isCheese()).isTrue();
        Assertions.assertThat(burger.isPepperoni()).isTrue();
        Assertions.assertThat(burger.isLettuce()).isTrue();
        Assertions.assertThat(burger.isTomato()).isTrue();
    }
}
