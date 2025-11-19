package com.rantomah.designpatterns.behavioral.strategy;

public class IntegerSorter implements Sorter<Integer> {

    private final SortStrategy<Integer> sorterSmall;
    private final SortStrategy<Integer> sorterBig;

    public IntegerSorter(SortStrategy<Integer> sorterSmall, SortStrategy<Integer> sorterBig) {
        this.sorterSmall = sorterSmall;
        this.sorterBig = sorterBig;
    }

    @Override
    public Integer[] sort(Integer[] dataset) {
        if (dataset == null || dataset.length == 0) {
            return dataset;
        }
        if (dataset.length > 5) {
            return sorterBig.sort(dataset);
        }
        return sorterSmall.sort(dataset);
    }
}
