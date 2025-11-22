package com.rantomah.designpatterns.behavioral.methodtemplate;

import org.junit.jupiter.api.*;

public class TemplateMethodTest {

    @Test
    public void test() {
        Pipeline javaPipeline = new MvnPipeline();
        Pipeline reactPipeline = new NpmPipeline();

        javaPipeline.runPipeline();
        reactPipeline.runPipeline();
    }
}
