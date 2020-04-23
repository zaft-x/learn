package com.zaft.learn.chapter_3.small_3_4_1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Predicate<String> p = (String s) -> !s.isEmpty();

        List<String> filter = filter(new ArrayList<>(), p);

    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        list.forEach(o -> {
            if (p.equals(o)) {
                results.add(o);
            }
        });

        return results;
    }
}
