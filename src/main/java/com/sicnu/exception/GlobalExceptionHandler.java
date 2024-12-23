package com.sicnu.exception;

import com.sicnu.pojo.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseResult globalExceptionHandler(Exception ex) {
        log.error("全局异常：" + ex);
        return ResponseResult.error();
    }
}
