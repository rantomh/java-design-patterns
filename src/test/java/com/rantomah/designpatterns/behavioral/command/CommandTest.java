package com.rantomah.designpatterns.behavioral.command;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CommandTest {

    @Test
    void test() {
        Editor editor = new Editor();
        CommandHistory history = new CommandHistory();

        Command cmd1 = new WriteCommand(editor, "Hello ");
        cmd1.execute();
        history.push(cmd1);

        Command cmd2 = new WriteCommand(editor, "World!");
        cmd2.execute();
        history.push(cmd2);

        assertThat(editor.getText()).isEqualTo("Hello World!");

        history.pop().undo();
        assertThat(editor.getText()).isEqualTo("Hello ");

        history.pop().undo();
        assertThat(editor.getText()).isEqualTo("");
    }
}
