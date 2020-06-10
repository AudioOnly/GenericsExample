package com.yrn.lib.demo1.bean;

/**
 * GenericsExample
 * <p>
 * Created by Xinhoo on 2020/6/8
 * Describe:
 */
public class Banana extends Fruit {
    private int id;

    public Banana(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "香蕉：id="+id;
    }
}
