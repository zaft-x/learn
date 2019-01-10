package com.zaft.learn.strategyPattern;

import java.util.Arrays;

/**
 * Created by zaft_x on 2019/1/3 0003.
 */
public class Splitter extends Processor{
    String process(Object input){
        return Arrays.toString(((String)input).split(","));
    }
}
