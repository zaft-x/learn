package com.zaft.learn.factory;

/**
 * Created by zaft_x on 2019/1/4 0004.
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory fact){
        Service service = fact.getService();
        service.mothed1();
        service.mothed2();
    }
    public static void main(String[] args) {
//        serviceConsumer(new Implementation1Factory());
//        serviceConsumer(new Implementation2Factory());
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}
