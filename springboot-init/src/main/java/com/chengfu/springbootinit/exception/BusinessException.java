package com.chengfu.springbootinit.exception;

import lombok.Getter;

/**
 * @BelongsProject: user-center-api
 * @BelongsPackage: com.chengfu.usercenterapi.exception
 * @Author: Chengfu Shi
 * @CreateTime: 2025-07-18 13:19
 * @Description: 自定义业务异常类
 * @Version: 1.0
 **/
@Getter
public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

}


