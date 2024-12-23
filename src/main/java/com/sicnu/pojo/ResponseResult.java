package com.sicnu.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseResult {

    private Integer code;
    private String msg;
    private Object data;

    public ResponseResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    // 运行成功
    public static ResponseResult success() {
        return new ResponseResult(200, "success!", null);
    }

    public static ResponseResult success(Object data) {
        return new ResponseResult(200, "success!", data);
    }

    // 运行错误
    public static ResponseResult error() {
        return new ResponseResult(500, "error!", null);
    }

    public static ResponseResult error(String msg) {
        return new ResponseResult(500, "error!", msg);
    }
}
