package com.rantomah.designpatterns.behavioral.methodtemplate;

public class MvnPipeline extends Pipeline {

    @Override
    public void checkout() {
        System.out.println("run git clone");
    }

    @Override
    public void lint() {
        System.out.println("run mvn spotless:apply");
    }

    @Override
    public void test() {
        System.out.println("run mvn test");
    }

    @Override
    public void build() {
        System.out.println("run mvn package");
    }

    @Override
    public void deploy() {
        System.out.println("run mvn deploy");
    }
}
