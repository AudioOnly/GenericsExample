package com.yrn.lib.demo1.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * GenericsExample
 * <p>
 * Created by Xinhoo on 2020/6/9
 * Describe:
 */
public class ColorPlate<K,T> extends BigPlate<T> {
    private List<T> items = new ArrayList<>(20);

    @Override
    public void add(T t) {
        items.add(t);
    }

    @Override
    public T get() {
        return super.get();
    }
}
