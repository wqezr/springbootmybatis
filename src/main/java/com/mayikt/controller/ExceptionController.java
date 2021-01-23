package com.mayikt.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2021/1/23.
 */
@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler({RuntimeException.class})
    public Map<String,String> exceptionHandler(){
        Map<String,String> map = new HashMap<>();
        map.put("respCode","500");
        map.put("respMsg","系统异常");
        return map;
    }

}
