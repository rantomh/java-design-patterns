package com.rantomah.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TeaShop {

    private final Map<Integer, Tea> orders = new HashMap<>();
    private final TeaMaker teaMaker;

    public Map<Integer, Tea> getOrders() {
        return orders;
    }

    public TeaShop(TeaMaker teaMaker) {
        this.teaMaker = teaMaker;
    }

    public void takeOrder(String teaType, Integer table) {
        Tea tea = teaMaker.make(teaType);
        orders.put(table, tea);
    }

    public void serve() {
        for (Map.Entry<Integer, Tea> entry : orders.entrySet()) {
            System.out.println("Serving table: " + entry.getKey());
        }
    }
}
