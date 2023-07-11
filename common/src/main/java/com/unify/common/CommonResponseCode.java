package com.unify.common;

import org.springframework.http.HttpStatus;

/**
 * @Author jerry
 * @Description 统一响应码
 * @Date 2023-07-11 22:52
 * @Version 1.0
 **/
public enum CommonResponseCode {


    SUCCESS("200", "操作成功"),

    /**
     * 404 Web 服务器找不到您所请求的文件或脚本。请检查URL 以确保路径正确。
     */
    NOT_FOUND("404",
            String.format("哎呀，无法找到这个资源啦(%s)", HttpStatus.NOT_FOUND.getReasonPhrase())),

    /**
     * 405 对于请求所标识的资源，不允许使用请求行中所指定的方法。请确保为所请求的资源设置了正确的 MIME 类型。
     */
    METHOD_NOT_ALLOWED("405",
            String.format("请换个姿势操作试试(%s)", HttpStatus.METHOD_NOT_ALLOWED.getReasonPhrase())),

    /**
     * 415 Unsupported Media Type
     */
    UNSUPPORTED_MEDIA_TYPE("415",
            String.format("呀，不支持该媒体类型(%s)", HttpStatus.UNSUPPORTED_MEDIA_TYPE.getReasonPhrase())),

    /**
     * 系统异常 500 服务器的内部错误
     */
    SERVER_ERROR("500", "服务器开小差，请稍后再试"),


    /**
     * 参数错误
     */
    PARAM_ERROR("100", "参数错误"),

    /**
     * 业务异常
     */
    BUSINESS_ERROR("400", "业务异常"),


    /**
     * rpc调用异常
     */
    RPC_ERROR("510", "呀，网络出问题啦！");

    private String code;

    private String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    CommonResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
