package com.zaft.learn.chapter_2.small_2_1;

import com.zaft.learn.chapter_1.small_1_1.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
