package com.rantomah.designpatterns.creational.singleton;

public class President {

    private static President instance;

    private President() {}

    public static synchronized President getInstance() {
        if (instance == null) {
            instance = new President();
        }
        return instance;
    }

    @Override
    public President clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
