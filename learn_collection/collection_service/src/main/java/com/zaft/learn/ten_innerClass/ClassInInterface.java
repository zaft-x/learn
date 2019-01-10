package com.zaft.learn.ten_innerClass;

/**
 * Created by zaft_x on 2019/1/7 0007.
 */
public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface{

        public void howdy() {
            System.out.println("test class in interface");
        }
        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
