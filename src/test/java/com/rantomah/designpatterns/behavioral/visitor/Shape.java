package com.rantomah.designpatterns.behavioral.visitor;

public interface Shape {

    void accept(ShapeVisitor visitor);
}
