package com.rantomah.designpatterns.creational.prototype;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PrototypeTest {

    @Test
    void test() throws CloneNotSupportedException {
        final String originalName = "Jolly";
        final String copyName = "Dolly";
        final String category = "Mountain Sheep";

        Sheep original = new Sheep(originalName);
        Sheep clone = (Sheep) original.clone();
        clone.setName(copyName);

        Assertions.assertThat(original).isNotSameAs(clone);

        Assertions.assertThat(original.getName()).isEqualTo(originalName);
        Assertions.assertThat(original.getCategory()).isEqualTo(category);

        Assertions.assertThat(clone.getName()).isEqualTo(copyName);
        Assertions.assertThat(clone.getCategory()).isEqualTo(category);
    }
}
