package com.rantomah.designpatterns.behavioral.visitor;

public class Rectangle implements Shape {

    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
