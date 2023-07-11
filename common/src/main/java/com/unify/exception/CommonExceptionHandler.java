package com.unify.exception;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import com.unify.common.CommonResponseCode;
import com.unify.common.Result;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import org.springframework.web.servlet.NoHandlerFoundException;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.Set;

/**
 * @Author jerry
 * @Description 统一异常处理
 * @Date 2023-07-11 22:48
 * @Version 1.0
 **/
@RestControllerAdvice
public class CommonExceptionHandler {

    private final static Logger log = LoggerFactory.getLogger(CommonExceptionHandler.class);

    /**
     * NoHandlerFoundException 404 异常处理
     */
    @ExceptionHandler(value = NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Result handlerNoHandlerFoundException(NoHandlerFoundException e) {
        return Result.failed(CommonResponseCode.NOT_FOUND);
    }

    /**
     * HttpRequestMethodNotSupportedException 405 异常处理
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public Result handlerHttpRequestMethodNotSupportedException(
            HttpRequestMethodNotSupportedException e) {
        return Result.failed(CommonResponseCode.METHOD_NOT_ALLOWED);
    }

    /**
     * HttpMediaTypeNotSupportedException 415 异常处理
     */
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public Result handlerHttpMediaTypeNotSupportedException(
            HttpMediaTypeNotSupportedException e) {
        return Result.failed(CommonResponseCode.UNSUPPORTED_MEDIA_TYPE);
    }


    /**
     * BusinessException 类捕获
     */
    @ExceptionHandler(value = CommonException.class)
    public Result handlerBusinessException(CommonException e) {
        return Result.failed(e.getErrorCode(), e.getMessage());
    }

    /**
     * HttpMessageNotReadableException 参数错误异常
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public Result handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {

        String msg = String.format("%s : 错误详情( %s )", CommonResponseCode.PARAM_ERROR.getMessage(),
                e.getRootCause().getMessage());
        return Result.failed(CommonResponseCode.PARAM_ERROR.getCode(), msg);
    }

    /**
     * ConstraintViolationException 参数错误异常
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public Result handleConstraintViolationException(ConstraintViolationException e) {
        String smg = "";
        Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
        if (log.isDebugEnabled()) {
            for (ConstraintViolation error : constraintViolations) {
                log.error("{} -> {}", error.getPropertyPath(), error.getMessageTemplate());
                smg = error.getMessageTemplate();
            }
        }

        if (constraintViolations.isEmpty()) {
            log.error("validExceptionHandler error fieldErrors is empty");
            Result.failed(CommonResponseCode.BUSINESS_ERROR.getCode(), "");
        }

        return Result.failed(CommonResponseCode.PARAM_ERROR.getCode(), smg);
    }

    /**
     * MethodArgumentNotValidException 参数错误异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        return getBindResultDTO(bindingResult);
    }

    /**
     * BindException 参数错误异常
     */
    @ExceptionHandler(BindException.class)
    public Result handleBindException(BindException e) {
        BindingResult bindingResult = e.getBindingResult();
        return getBindResultDTO(bindingResult);
    }

    private Result getBindResultDTO(BindingResult bindingResult) {
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        if (log.isDebugEnabled()) {
            for (FieldError error : fieldErrors) {
                log.error("{} -> {}", error.getDefaultMessage(), error.getDefaultMessage());
            }
        }

        if (fieldErrors.isEmpty()) {
            log.error("validExceptionHandler error fieldErrors is empty");
            Result.failed(CommonResponseCode.BUSINESS_ERROR.getCode(), "");
        }

        return Result.failed(CommonResponseCode.PARAM_ERROR.getCode(), fieldErrors.get(0).getDefaultMessage());
    }

    /**
     * BindException 参数错误异常
     */
    @ExceptionHandler(Throwable.class)
    public Result error(Throwable e) {
        return Result.failed(CommonResponseCode.SERVER_ERROR.getCode(), CommonResponseCode.SERVER_ERROR.getMessage());
    }
}
