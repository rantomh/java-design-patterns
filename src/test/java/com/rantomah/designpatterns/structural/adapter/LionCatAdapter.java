package com.rantomah.designpatterns.structural.adapter;

public class LionCatAdapter implements Cat {

    private final Lion lion;

    public LionCatAdapter(Lion lion) {
        this.lion = lion;
    }

    @Override
    public void meow() {
        lion.roar();
    }
}
