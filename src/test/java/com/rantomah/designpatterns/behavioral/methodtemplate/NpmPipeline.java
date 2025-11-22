package com.rantomah.designpatterns.behavioral.methodtemplate;

public class NpmPipeline extends Pipeline {

    @Override
    public void checkout() {
        System.out.println("run svn checkout");
    }

    @Override
    public void lint() {
        System.out.println("run npm run lint");
    }

    @Override
    public void test() {
        System.out.println("run npm run test");
    }

    @Override
    public void build() {
        System.out.println("run npm run build");
    }

    @Override
    public void deploy() {
        System.out.println("run npm publish");
    }
}
