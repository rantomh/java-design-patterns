package com.rantomah.designpatterns.behavioral.methodtemplate;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.*;

class TemplateMethodTest {

    private static final String OUTPUT =
"""
run git clone
run mvn spotless:apply
run mvn test
run mvn package
run mvn deploy
run svn checkout
run npm run lint
run npm run test
run npm run build
run npm publish
""";

    @Test
    void test() {
        var output = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(output));

        Pipeline javaPipeline = new MvnPipeline();
        Pipeline reactPipeline = new NpmPipeline();

        javaPipeline.run();
        reactPipeline.run();

        assertThat(output.toString()).isEqualToIgnoringNewLines(OUTPUT);
    }
}
