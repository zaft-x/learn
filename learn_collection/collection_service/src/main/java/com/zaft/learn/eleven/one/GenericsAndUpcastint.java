package com.zaft.learn.eleven.one;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zaft_x on 2019/1/9 0009.
 */
public class GenericsAndUpcastint {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<Apple>();
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new GrannySmith());
        for(Apple apple : apples)
            System.out.println(apple.id());
    }
}
