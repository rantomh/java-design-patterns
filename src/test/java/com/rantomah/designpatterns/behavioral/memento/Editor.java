package com.rantomah.designpatterns.behavioral.memento;

public class Editor {

    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public Memento<String> save() {
        return new EditorMemento(content);
    }

    public void restore(Memento<String> memento) {
        this.content = memento.getState();
    }

    public String getContent() {
        return content;
    }
}
