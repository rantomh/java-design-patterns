package com.rantomah.designpatterns.creational.builder;

public class Burger {

    private int size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean lettuce;
    private boolean tomato;

    public Burger() {}

    public Burger(BurgerBuilder builder) {
        this.size = builder.getSize();
        this.cheese = builder.isCheese();
        this.pepperoni = builder.isPepperoni();
        this.lettuce = builder.isLettuce();
        this.tomato = builder.isTomato();
    }

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
}
