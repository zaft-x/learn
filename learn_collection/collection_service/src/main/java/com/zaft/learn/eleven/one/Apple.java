package com.zaft.learn.eleven.one;

/**
 * Created by zaft_x on 2019/1/9 0009.
 */
public class Apple {
    private static long counter;
    private final long id = counter++;
    public long id(){
        return id;
    }
}
