package com.chengfu.springbootinit.exception;

import com.chengfu.springbootinit.common.BaseResponse;
import com.chengfu.springbootinit.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @BelongsProject: user-center-api
 * @BelongsPackage: com.chengfu.usercenterapi.exception
 * @Author: Chengfu Shi
 * @CreateTime: 2025-07-18 13:29
 * @Description: 全局异常处理器
 * @Version: 1.0
 **/
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> businessExceptionHandler(BusinessException e) {
        log.error("BusinessException", e);
        return ResultUtils.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> runtimeExceptionHandler(RuntimeException e) {
        log.error("RuntimeException", e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, "系统错误");
    }
}


