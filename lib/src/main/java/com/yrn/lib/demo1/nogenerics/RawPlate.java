package com.yrn.lib.demo1.nogenerics;

import com.yrn.lib.demo1.bean.Fruit;
import com.yrn.lib.demo1.generics.Plate;

import java.util.ArrayList;
import java.util.List;

/**
 * GenericsExample
 * <普通类--不适用泛型>
 * Created by Xinhoo on 2020/6/8
 * Describe:
 */
public class RawPlate implements Plate {

    List items = new ArrayList();

    @Override
    public Fruit get() {
        int size = items.size() - 1;
        if (size >= 0) {
            return (Fruit) items.get(size);
        } else {
            return null;
        }
    }

    @Override
    public void add(Object o) {
        items.add(o);
    }

    @Override
    public String toString() {
        return "RawPlate{" +
                "items=" + items +
                '}';
    }
}
