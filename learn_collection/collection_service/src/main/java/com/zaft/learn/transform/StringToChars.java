package com.zaft.learn.transform;

/**
 * Created by zaft_x on 2019/1/3 0003.
 */
public class StringToChars {
    public static void main(String[] args) {
        String s = "a,b,c,d,e,f";
        char[] chars = s.toCharArray();
        for(int i =0; i<chars.length; i++)
            System.out.println(chars[i]);
    }
}
