package com.zaft.bean;

/**
 * Created by zaft_x on 2018/12/27 0027.
 */
public class Test1 {
    public Test1(){
        System.out.println("构造函数初始化---");
    }

    Test1 getTest(){
        return this;
    }

    public Test1(String str){
        System.out.println("构造函数初始化----" + str);
    }


}
