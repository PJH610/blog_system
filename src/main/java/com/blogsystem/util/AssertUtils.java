package com.blogsystem.util;

/**
 * Created by SX-503 on 2018/11/2.
 */
public class AssertUtils {
    public static void requireTrue(boolean value, String msg) {
        if (!value) {
            throw new RuntimeException(msg);
        }
    }
}

