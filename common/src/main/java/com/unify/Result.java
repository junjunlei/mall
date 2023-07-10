package com.unify;

import java.io.Serializable;

/**
 * @Author jerry
 * @Description 统一返回结果封装
 * @Date 2023-07-11 00:11
 * @Version 1.0
 **/
public class Result<T> implements Serializable {


    private static final String SUCCESS_CODE = "200";

    private static final String SUCCESS_MESSAGE = "操作成功";

    /**
     * 是否成功
     */
    private Boolean success;

    /**
     * 时间戳
     */
    private Long timestamp = System.currentTimeMillis();

    /**
     * 返回数据
     */
    private T data;

    /**
     * 响应码
     */
    private String code;

    /**
     * 响应描述
     */
    private String message;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result() {
    }


    public Result(Boolean success, Long timestamp, T data, String code, String message) {
        this.success = success;
        this.timestamp = timestamp;
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public static Result success() {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setMessage(SUCCESS_MESSAGE);
        return result;
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.setSuccess(true);
        result.setData(data);
        result.setCode(SUCCESS_CODE);
        result.setMessage(SUCCESS_MESSAGE);
        return result;
    }

    public static Result failed(String code, String message) {
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
