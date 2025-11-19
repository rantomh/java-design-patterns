package com.rantomah.designpatterns.structural.adapter;

public class Persian implements Cat {

    @Override
    public void meow() {
        System.out.println("Persian meow!");
    }
}
