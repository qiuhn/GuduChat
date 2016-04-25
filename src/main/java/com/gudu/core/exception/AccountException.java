package com.gudu.core.exception;

/**
 * Created by qiuhn on 2015/9/21.
 */
public class AccountException extends CustomerException{

    public static final int CODE_USER_NOT_EXIST=102;

    public static final String MESSAGE_PWD_ERROR = "密码错误";
    public static final String MESSAGE_USER_NOT_EXIST="用户不存在";
    public static final int CODE_PWD_ERROR = 101;

    public AccountException(int code, String message) {
        super(code, message);
    }



}
