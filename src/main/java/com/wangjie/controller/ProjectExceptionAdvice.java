package com.wangjie.controller;

import com.wangjie.exception.BusinessException;
import com.wangjie.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e) {
        return new Result(null, e.getCode(), e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e) {
        return new Result(null, e.getCode(), e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result doException(Exception e) {
        return new Result(null, Code.SYSTEM_UNKNOW_ERR, "抱歉，出现未知错误！");
    }
}
