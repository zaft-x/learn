package com.zaft.learn.chapter_2.small_2_1;

import com.zaft.learn.chapter_1.small_1_1.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringApples {
    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(new Apple("green",80),
                new Apple("green", 155),
                new Apple("red", 120));
        List<Apple> heavyApples = filterApples(apples, new AppleHeavyWeightPredicate());
        List<Apple> greenApples = filterApples(apples, new AppleGreenColorPredicate());

        System.out.println(greenApples);
    }

    private static List<Apple> filterApples(List<Apple> apples, ApplePredicate applePredicate) {
        List<Apple> results = new ArrayList<>();
        for (Apple apple : apples) {
            if(applePredicate.test(apple)){
                results.add(apple);
            }
        }
        return results;
    }
}
