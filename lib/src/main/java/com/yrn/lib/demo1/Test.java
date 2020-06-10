package com.yrn.lib.demo1;

import com.yrn.lib.demo1.bean.Apple;
import com.yrn.lib.demo1.bean.Banana;
import com.yrn.lib.demo1.bean.Fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    //java泛型的 PECS 原则使用场景
    public static void method07() {
        //苹果
        List<Apple> src = new ArrayList<>();
        src.add(new Apple(1));
        List<Apple> dest = new ArrayList<>(10);
        dest.add(new Apple(2));
        System.out.println(dest);
        copy(dest, src);
        System.out.println(dest);
        //香蕉
        List<Banana> src1 = new ArrayList<>();
        src1.add(new Banana(1));
        List<Banana> dest1 = new ArrayList<>(10);
        dest1.add(new Banana(2));
        //编译时候报错，因为参数类型错误
//        copy(dest1,src1);//
        copy1(dest1, src1);//泛型方法

        List<Fruit> dest2 = new ArrayList<>(10);
        src1.add(new Banana(1));
        //编译时候报错，同样因为参数类型错误
//        copy1(dest2,src1);
        // copy1 实际调用方式为：Test.<Banana>copy1(dest2,src1);
        Test.<Banana>copy2(dest2, src1);//使用下界通配符 泛型方法
        //报错，同样是因为 参数类型不匹配
//        Test.<Fruit>copy2(dest2, src1);
        Test.<Fruit>copy3(dest2, src1);//使用 上界通配符，泛型方法；


    }

    public static void copy(List<Apple> dest, List<Apple> src) {
        Collections.copy(dest, src);
    }

    public static <T> void copy1(List<T> dest, List<T> src) {
        Collections.copy(dest, src);
    }

    public static <T> void copy2(List<? super T> dest, List<T> src) {
        Collections.copy(dest, src);
    }

    /**
     * copy 方法最终演变 的结果
     * @param dest 消费者（可以往里面存东西） 只要是‘T’的父类型都可以作为参数传递进来
     * @param src 生产者（可以从中取出元素）  只要是‘T’的子类都可以作为参数传递进来
     * @param <T>
     */
    public static <T> void copy3(List<? super T> dest, List<? extends T> src) {
        Collections.copy(dest, src);
    }

    public static void main(String[] args) {
        method07();
    }
}
