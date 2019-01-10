package com.zaft.learn.eleven.one;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zaft_x on 2019/1/9 0009.
 */
public class ApplesAndOrangesWithoutGenerics {
    public static void main(String[] args) {
        List apples = new ArrayList();
        for(int i=0; i<3; i++)
            apples.add(new Apple());
//        apples.add(new Orange());//下面遍历
        for(int i = 0; i<apples.size(); i++)
            System.out.println(((Apple) apples.get(i)).id());
//            ((Apple) apples.get(i)).id();
    }

}
