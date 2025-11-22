package com.rantomah.designpatterns.behavioral.visitor;

public class Square implements Shape {

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
