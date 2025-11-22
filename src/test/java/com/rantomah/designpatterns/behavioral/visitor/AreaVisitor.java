package com.rantomah.designpatterns.behavioral.visitor;

public class AreaVisitor implements ShapeVisitor {

    @Override
    public void visit(Square square) {
        double area = square.side * square.side;
        System.out.println("Area of Square: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.width * rectangle.height;
        System.out.println("Area of Rectangle: " + area);
    }
}
