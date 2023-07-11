package com.unify.exception;

/**
 * @Author jerry
 * @Description 通用业务异常
 * @Date 2023-07-11 23:01
 * @Version 1.0
 **/
public class CommonException extends RuntimeException {

    private String errorCode;


    public String getErrorCode() {
        return errorCode;
    }


    public CommonException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
