package com.zaft.learn.ten_innerClass;

/**
 * Created by zaft_x on 2019/1/8 0008.
 */
public class Callee2 extends MyIncrement{
    private int i=0;
    public void increment(){
        super.increment();
        i++;
        System.out.println("Callee2 :"+i);
    }
    private class Closure implements Incrementable{

        public void increment() {
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference(){
        return new Closure();
    }
}
