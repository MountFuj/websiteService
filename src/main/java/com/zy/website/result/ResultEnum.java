package com.zy.website.result;

public enum ResultEnum {
   Success(200,"成功"),
    Fail(500,"服务器内部故障"),
    NotFound(404,"找不到资源"),
    Unauthorized(401,"未授权");

    private Integer code;
    private String message;

    ResultEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
    public Integer getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
}
