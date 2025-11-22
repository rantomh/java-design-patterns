package com.rantomah.designpatterns.behavioral.methodtemplate;

public abstract class Pipeline {

    public final void run() {
        checkout();
        lint();
        test();
        build();
        deploy();
    }

    protected abstract void checkout();

    protected abstract void lint();

    protected abstract void test();

    protected abstract void build();

    protected abstract void deploy();
}
