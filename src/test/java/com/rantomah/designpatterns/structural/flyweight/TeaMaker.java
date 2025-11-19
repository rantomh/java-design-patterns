package com.rantomah.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TeaMaker {

    private final Map<String, Tea> availableTea = new HashMap<>();

    public Tea make(String preference) {
        if (!availableTea.containsKey(preference)) {
            System.out.println(preference);
            availableTea.put(preference, new Tea());
        }
        return availableTea.get(preference);
    }
}
