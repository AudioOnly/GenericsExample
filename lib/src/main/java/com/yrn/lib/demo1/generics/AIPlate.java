package com.yrn.lib.demo1.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * GenericsExample
 * < 泛型---类>
 * Created by Xinhoo on 2020/6/8
 * Describe:
 */
public class AIPlate <T> implements Plate<T> {
    private List<T> items = new ArrayList<T>(10);
    @Override
    public T get() {
        int index = items.size() -1;
        if(index>= 0){
            return items.get(index);
        }else{
            return null;
        }
    }

    @Override
    public void add(T t) {
        items.add(t);
    }

    @Override
    public String toString() {
        return "AIPlate{" +
                "items=" + items +
                '}';
    }
}
