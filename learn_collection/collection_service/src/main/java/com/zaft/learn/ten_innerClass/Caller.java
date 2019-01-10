package com.zaft.learn.ten_innerClass;

/**
 * Created by zaft_x on 2019/1/8 0008.
 */
public class Caller {
    private Incrementable callbackReferece;
    Caller(Incrementable cbh){
        callbackReferece = cbh;
    }
    void go(){
        callbackReferece.increment();
    }
}
