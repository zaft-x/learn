package com.java.api.annotation;

/**
 * @ClassName PasswordUtils
 * @Description: TODO
 * @Author zaft_x
 * @Date 2019/11/15 0015
 * @Version V1.0
 **/
public class PasswordUtils {
    @UseCase.UseCases(id="1", description="111")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }
    @UseCase.UseCases(id ="48")
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }
}
