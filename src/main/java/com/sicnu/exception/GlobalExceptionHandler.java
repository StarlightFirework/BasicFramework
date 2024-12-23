package com.sicnu.exception;

import com.sicnu.pojo.responseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public responseResult globalExceptionHandler(Exception ex) {
        log.error("全局异常：" + ex);
        return responseResult.error();
    }
}
