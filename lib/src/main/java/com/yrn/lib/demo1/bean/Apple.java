package com.yrn.lib.demo1.bean;

/**
 * GenericsExample
 * <p>
 * Created by Xinhoo on 2020/6/8
 * Describe:
 */
public class Apple extends Fruit {

    private int id;

    public Apple(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "苹果:" + id;
    }
}
