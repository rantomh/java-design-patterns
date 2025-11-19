package com.rantomah.designpatterns.behavioral.strategy;

public interface SortStrategy<T> {

    T[] sort(T[] dataset);
}
