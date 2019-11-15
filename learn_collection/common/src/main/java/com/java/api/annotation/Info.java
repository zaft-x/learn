package com.java.api.annotation;

import java.lang.annotation.*;

/**
 * @ClassName Info
 * @Description: TODO
 * @Author zaft_x
 * @Date 2019/11/15 0015
 * @Version V1.0
 **/
@Documented
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Info {
    String value() default "tracy";
    boolean isDelete();
}
