package com.yrn.lib.demo1.bean;

import com.yrn.lib.demo1.generics.AIPlate;
import com.yrn.lib.demo1.generics.Plate;
import com.yrn.lib.demo1.nogenerics.RawPlate;

/**
 * GenericsExample
 * <p>
 * Created by Xinhoo on 2020/6/8
 * Describe:
 */
public class XiaoMing extends Person {

    public Plate getPlate() {
        return new RawPlate();
    }


    /**
     * 泛型方法
     * @param <T>
     * @return
     */
    public <T> AIPlate<T> getAiPlate() {
        return new AIPlate<T>();
    }

}
