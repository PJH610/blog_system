package com.blogsystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by SX-503 on 2018/10/29.
 */
public abstract class BaseController {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(Exception.class)
    public String resourceNotFoundExceptionHandler(Exception ex)
    {
        System.out.println("捕获到异常");
        ex.printStackTrace();
        return "/";
    }
}
