package com.zaft.learn.factory;

/**
 * Created by zaft_x on 2019/1/4 0004.
 */
public class Implementation1 implements Service{
    public void mothed1() {
        System.out.println("Implementation1 mothed1");
    }

    public void mothed2() {
        System.out.println("Implementation1 mothed2");
    }

    Implementation1(){}

    //    使用匿名内部类构建工厂模式
    public static ServiceFactory factory = new ServiceFactory() {
        public Service getService() {
            return new Implementation1();
        }
    };
}
