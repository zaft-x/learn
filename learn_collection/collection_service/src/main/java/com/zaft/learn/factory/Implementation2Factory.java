package com.zaft.learn.factory;

/**
 * Created by zaft_x on 2019/1/4 0004.
 */
public class Implementation2Factory implements ServiceFactory{
    public Service getService() {
        return new Implementation2();
    }
}
