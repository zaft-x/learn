package com.zaft.learn.strategyPattern;

/**
 * ch
 * Created by zaft_x on 2019/1/3 0003.
 */
public class Processor {
    public String name(){
        return getClass().getSimpleName();
    }

    Object process(Object input){return input;}
}
