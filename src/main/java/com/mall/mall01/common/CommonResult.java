package com.mall.mall01.common;

/**
 * @date 2023/02/05
 */
public class CommonResult<T> {

    private long code;

    private String message;

    private T data;

    protected CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


}