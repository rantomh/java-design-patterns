package com.rantomah.designpatterns.creational.simplefactory;

class WoodenDoor implements Door {

    private float width;
    private float height;

    public WoodenDoor(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
