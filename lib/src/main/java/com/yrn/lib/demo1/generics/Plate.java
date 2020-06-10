package com.yrn.lib.demo1.generics;

/**
 * GenericsExample
 * < 泛型 接口-->
 * Created by Xinhoo on 2020/6/8
 * Describe:
 */
public interface Plate<T> {

    public T get();

    public void add(T t);

}
