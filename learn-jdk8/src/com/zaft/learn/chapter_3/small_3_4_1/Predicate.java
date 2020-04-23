package com.zaft.learn.chapter_3.small_3_4_1;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T  t);
}
