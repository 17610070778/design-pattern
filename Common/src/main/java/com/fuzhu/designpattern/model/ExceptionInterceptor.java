package com.fuzhu.designpattern.model;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 辅助
 * @version 1.0
 * @date 2021/3/22 18:20
 */
@ControllerAdvice
@ResponseBody
public class ExceptionInterceptor {
    @ExceptionHandler(value = Exception.class)
    public ResultInfo exceptionHandler(Exception e){
        return ResultInfo.buildFaild(e.getMessage());
    }
}
