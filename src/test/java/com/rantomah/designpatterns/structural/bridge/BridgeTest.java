package com.rantomah.designpatterns.structural.bridge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BridgeTest {

    @Test
    public void test() {
        Theme darkTheme = new DarkTheme();

        WebPage about = new About(darkTheme);
        WebPage careers = new Careers(darkTheme);

        Assertions.assertThat(about.getContent()).isEqualTo("About page in Dark Black");
        Assertions.assertThat(careers.getContent()).isEqualTo("Careers page in Dark Black");
    }
}
