package com.rantomah.designpatterns.creational.builder;

public class BurgerBuilder {

    private int size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean lettuce;
    private boolean tomato;

    public BurgerBuilder() {}

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public BurgerBuilder size(int size) {
        this.size = size;
        return this;
    }

    public BurgerBuilder cheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public BurgerBuilder pepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    public BurgerBuilder lettuce(boolean lettuce) {
        this.lettuce = lettuce;
        return this;
    }

    public BurgerBuilder tomato(boolean tomato) {
        this.tomato = tomato;
        return this;
    }

    public Burger build() {
        return new Burger(this);
    }
}
