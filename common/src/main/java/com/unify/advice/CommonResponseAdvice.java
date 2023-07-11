package com.unify.advice;

import com.alibaba.fastjson.JSON;
import com.unify.common.Result;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Author jerry
 * @Description 统一返回结果处理advice
 * @Date 2023-07-11 00:24
 * @Version 1.0
 **/
@RestControllerAdvice
public class CommonResponseAdvice implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        Class<?> declaringClass = methodParameter.getDeclaringClass();
        List<String> filterPackageList = new ArrayList<>();
        //swagger 包路径
        filterPackageList.add("springfox.documentation");
        //spring 包路径
        filterPackageList.add("org.springframework");
        if (filterPackageList.stream().filter(packagePath -> declaringClass.getName().contains(packagePath)).count() > 0) {
            return false;
        }
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        //返回值为Object 且为空时 不走本方法 所以避免使用Object为返回类型

        if (Objects.isNull(o)) {
            //处理返回值为String且为空的场景
            if (methodParameter.getParameterType().getName().equals("java.lang.String")) {
                return JSON.toJSONString(Result.success());
            }
            return Result.success();
        }

        if (o instanceof Result) {
            return o;
        }
        if (o instanceof String) {
            return JSON.toJSONString(Result.success(o));
        }
        return Result.success(o);
    }
}
