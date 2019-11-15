package com.java.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName UseCase
 * @Description: TODO
 * @Author zaft_x
 * @Date 2019/11/15 0015
 * @Version V1.0
 **/
public class UseCase {
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface UseCases{
        public String id();
        public String description() default "no description";
    }
}
