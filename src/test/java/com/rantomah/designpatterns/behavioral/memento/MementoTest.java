package com.rantomah.designpatterns.behavioral.memento;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MementoTest {

    @Test
    public void test() {
        Editor editor = new Editor();
        EditorHistory history = new EditorHistory();

        editor.setContent("Version 1");
        history.push(editor.save());

        editor.setContent("Version 2");
        history.push(editor.save());

        editor.setContent("Version 3");
        assertThat(editor.getContent()).isEqualTo("Version 3");

        editor.restore(history.pop());
        assertThat(editor.getContent()).isEqualTo("Version 2");

        editor.restore(history.pop());
        assertThat(editor.getContent()).isEqualTo("Version 1");
    }
}
