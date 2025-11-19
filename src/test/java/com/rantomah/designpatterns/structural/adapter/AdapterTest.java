package com.rantomah.designpatterns.structural.adapter;

import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    public void test() {
        Lion lion = new Lion();
        LionCatAdapter lionCatAdapter = new LionCatAdapter(lion);

        CatLover catLover = new CatLover();
        catLover.huge(lionCatAdapter);
    }
}
