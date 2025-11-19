package com.rantomah.designpatterns.behavioral.command;

public class Editor {

    private String text = "";

    public void write(String newText) {
        this.text += newText;
    }

    public void setText(String newText) {
        this.text = newText;
    }

    public String getText() {
        return text;
    }
}
