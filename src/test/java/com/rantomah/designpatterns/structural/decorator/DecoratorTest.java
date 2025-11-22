package com.rantomah.designpatterns.structural.decorator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DecoratorTest {

    @Test
    void test() {

        Coffee simpleCoffee = new SimpleCoffee();

        Coffee milkCoffee = new MilkCoffee(simpleCoffee);
        Assertions.assertThat(milkCoffee.getCost()).isEqualTo(simpleCoffee.getCost() + 2);
        Assertions.assertThat(milkCoffee.getDescription()).contains("milk");

        Coffee whipCoffee = new WhipCoffee(simpleCoffee);
        Assertions.assertThat(whipCoffee.getCost()).isEqualTo(simpleCoffee.getCost() + 5);
        Assertions.assertThat(whipCoffee.getDescription()).contains("whip");

        Coffee vanillaCoffee = new VanillaCoffee(simpleCoffee);
        Assertions.assertThat(vanillaCoffee.getCost()).isEqualTo(simpleCoffee.getCost() + 3);
        Assertions.assertThat(vanillaCoffee.getDescription()).contains("vanilla");
    }
}
