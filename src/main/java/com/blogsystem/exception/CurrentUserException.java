package com.blogsystem.exception;

/**
 * Created by SX-503 on 2018/10/29.
 */
public class CurrentUserException extends RuntimeException {
    public CurrentUserException(String message) {
        super(message);
    }
}
