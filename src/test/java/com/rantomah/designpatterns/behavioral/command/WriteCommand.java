package com.rantomah.designpatterns.behavioral.command;

public class WriteCommand implements Command {

    private final Editor editor;
    private final String newText;
    private String previousText;

    public WriteCommand(Editor editor, String newText) {
        this.editor = editor;
        this.newText = newText;
    }

    @Override
    public void execute() {
        previousText = editor.getText();
        editor.write(newText);
    }

    @Override
    public void undo() {
        editor.setText(previousText);
    }
}
