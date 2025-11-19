package com.rantomah.designpatterns.creational.prototype;

public class Sheep implements Cloneable {

    private String name;
    private String category;

    public Sheep(String name) {
        this(name, "Mountain Sheep");
    }

    public Sheep(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
