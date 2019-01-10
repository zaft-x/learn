package com.zaft.learn;

import java.util.Random;

/**
 * Created by zaft_x on 2019/1/2 0002.
 */
public class Final {

    public static void main(String[] args) {
        d1();
        d2();
    }

    private static void d1(){
        for(int i=0; i<10; i++){
            Random rand = new Random(100);
            System.out.println(rand.nextInt(20));
        }
    }

    private static void d2(){
        Random rand = new Random(100);
        for(int i=0; i<10; i++){
            System.out.println(rand.nextInt(9));
        }
    }
}
