package com.zy.website.result;

import lombok.Data;

@Data
public class CommonResult<T> {

    private Integer code;

    private String message;

    private T data;

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static CommonResult success(){
        return new CommonResult(ResultEnum.Success.getCode(),ResultEnum.Success.getMessage(),null);
    }

    public static <T> CommonResult success(T data){
        return new CommonResult(ResultEnum.Success.getCode(),ResultEnum.Success.getMessage(),data);
    }

    public static CommonResult fail(){
        return new CommonResult(ResultEnum.Fail.getCode(),ResultEnum.Fail.getMessage(),null);
    }

    public static <T> CommonResult fail(T data){
        return new CommonResult(ResultEnum.Fail.getCode(),ResultEnum.Fail.getMessage(),data);
    }
}
