package com.zaft.learn.strategyPattern;

/**
 * Created by zaft_x on 2019/1/3 0003.
 */
public class Apply {
    public static void process(Processor p, Object s){
            System.out.println("using Processor " + p.name());
            System.out.println(p.process(s));
    }

    public static String s = "This is an example of simple, the first!";
    public static void main(String[] args) {
        process(new UpCase(), s);
        process(new DownCase(), s);
        process(new Splitter(), s);

    }
}
