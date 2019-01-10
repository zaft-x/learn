package com.zaft.learn;

import java.util.Random;

/**
 * Created by zaft_x on 2019/1/2 0002.
 */
public class FinalData {
    private static Random rand = new Random(47);
    private String id;
    public FinalData(String id){
        this.id=id;
    }
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;
    private static  final int VALUE_THREE = 39;
    private final int i4=rand.nextInt(20);
    static final int INT_I5 = rand.nextInt(20);

    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static Value v_3 = new Value(33);
    private final int[] a = {1,2,3,4,5,6};

    public String toString(){
        return id+": i4 = "+i4+". int_i5 = "+INT_I5;
    }


    public static void main(String[] args) {
        /*FinalData fd1 = new FinalData("fd1");
        fd1.v2.i++;
        fd1.v1 = new Value(9);
        for(int i=0; i < fd1.a.length; i++)
            fd1.a[i]++;
        System.out.println(fd1);
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);*/

        System.out.println(rand.nextInt(20));

    }
}
