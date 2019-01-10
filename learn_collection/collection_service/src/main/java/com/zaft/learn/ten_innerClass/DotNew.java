package com.zaft.learn.ten_innerClass;

/**
 * Created by zaft_x on 2019/1/4 0004.
 * 10.3
 */
public class DotNew {
    public class Inner{

    }
    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();

        new DotNew().new Inner();
    }
}
