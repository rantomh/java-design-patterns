package com.rantomah.designpatterns.structural.adapter;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class AdapterTest {

    @Test
    void test() {
        var output = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(output));

        Lion lion = new Lion();
        LionCatAdapter lionCatAdapter = new LionCatAdapter(lion);

        CatLover catLover = new CatLover();
        catLover.huge(lionCatAdapter);

        assertThat(output.toString()).isEqualToIgnoringNewLines("Lion roar!");
    }
}
