package com.java.api;

import com.java.api.annotation.PasswordUtils;
import com.java.api.annotation.UseCase;
import org.apache.ibatis.annotations.Param;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName UserCaseTest
 * @Description: TODO
 * @Author zaft_x
 * @Date 2019/11/15 0015
 * @Version V1.0
 **/
public class UserCaseTest {
    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<Integer>();
        Collections.addAll(useCases, 47, 48, 49, 50);
        trackUseCases(useCases, PasswordUtils.class);
    }

    public static void trackUseCases(List<Integer> useCases, Class<?> cl) {
        for (Method m : cl.getDeclaredMethods()) {
            //获得注解的对象
            UseCase.UseCases uc = m.getAnnotation(UseCase.UseCases.class);
            if (uc != null) {
                System.out.println("Found Use Case:" + uc.id() + " "
                        + uc.description());
                useCases.remove(new Integer(uc.id()));
            }
        }
        for (int i : useCases) {
            System.out.println("Warning: Missing use case-" + i);
//            @Param()
        }
    }
}
