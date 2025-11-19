package com.rantomah.designpatterns.behavioral.strategy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    public void test() {
        Integer[] smalldataset = new Integer[] {3, 4, 1, 2};
        Integer[] bigdataset = new Integer[] {4, 3, 2, 8, 10, 5, 6, 9, 7};

        Sorter<Integer> sorter =
                new IntegerSorter(new BubbleSortStrategy(), new QuickSortStrategy());

        Integer[] smalldatasetSorted = sorter.sort(smalldataset);
        Integer[] bigdatasetSorted = sorter.sort(bigdataset);

        assertThat(smalldatasetSorted).containsExactly(1, 2, 3, 4);
        assertThat(bigdatasetSorted).containsExactly(2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
