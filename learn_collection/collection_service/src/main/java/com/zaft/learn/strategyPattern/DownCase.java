package com.zaft.learn.strategyPattern;

/**
 * Created by zaft_x on 2019/1/3 0003.
 */
public class DownCase extends Processor{
    String process(Object input){
        return ((String) input).toLowerCase();
    }
}

