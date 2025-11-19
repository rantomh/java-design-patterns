package com.rantomah.designpatterns.behavioral.strategy;

import java.util.Arrays;

public class BubbleSortStrategy implements SortStrategy<Integer> {

    @Override
    public Integer[] sort(Integer[] dataset) {
        Integer[] clone = dataset.clone();
        Arrays.sort(clone);
        return clone;
    }
}
