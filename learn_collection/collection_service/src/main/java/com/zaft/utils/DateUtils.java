package com.zaft.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zaft_x on 2018/12/27 0027.
 */
public class DateUtils {
    static final SimpleDateFormat yyyyMMddHHmmss = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String getDateStr(Date date){

        return  yyyyMMddHHmmss.format(date);
    }

    public static void main(String[] args) {
        String date = getDateStr(new Date());
        System.out.println(date);
    }
}
