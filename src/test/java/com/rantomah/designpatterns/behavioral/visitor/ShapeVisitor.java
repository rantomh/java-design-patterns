package com.rantomah.designpatterns.behavioral.visitor;

public interface ShapeVisitor {

    void visit(Square square);

    void visit(Rectangle rectangle);
}
