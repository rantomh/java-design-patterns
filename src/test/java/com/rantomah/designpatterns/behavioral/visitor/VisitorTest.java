package com.rantomah.designpatterns.behavioral.visitor;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class VisitorTest {

    private static final String OUTPUT =
"""
Area of Square: 25.0
Area of Rectangle: 12.0
""";

    @Test
    void test() {
        var output = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(output));

        Shape square = new Square(5);
        Shape rectangle = new Rectangle(4, 3);

        ShapeVisitor areaVisitor = new AreaVisitor();

        square.accept(areaVisitor);
        rectangle.accept(areaVisitor);

        assertThat(output.toString()).isEqualToIgnoringNewLines(OUTPUT);
    }
}
