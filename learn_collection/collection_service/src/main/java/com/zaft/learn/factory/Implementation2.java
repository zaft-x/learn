package com.zaft.learn.factory;

/**
 * Created by zaft_x on 2019/1/4 0004.
 */
public class Implementation2 implements Service{
    public void mothed1() {
        System.out.println("Implementation2 mothed1");
    }

    public void mothed2() {
        System.out.println("Implementation2 mothed2");
    }

    Implementation2(){}

//    使用匿名内部类构建工厂模式
    public static ServiceFactory factory = new ServiceFactory() {
        public Service getService() {
            return new Implementation2();
        }
    };
}
