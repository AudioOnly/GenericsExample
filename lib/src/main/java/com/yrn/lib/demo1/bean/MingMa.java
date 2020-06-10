package com.yrn.lib.demo1.bean;

import com.yrn.lib.demo1.generics.AIPlate;
import com.yrn.lib.demo1.nogenerics.RawPlate;

/**
 * GenericsExample
 * <小明妈>
 * Created by Xinhoo on 2020/6/8
 * Describe:
 */
public class MingMa extends Person {


    private void addFruit(RawPlate plate) {
        plate.add(new Apple(0));
    }


    /**
     * 这里不是泛型方法，这里知识一个普通方法，只是使用了AIPlate<Banana>这个泛型类做形参而已
     * @param aiPlate
     */
    public void addFruitForAiPlate(AIPlate<Banana> aiPlate) {
//        aiPlate.add(new Apple());
        aiPlate.add(new Banana());

    }
}
