package com.sicnu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class responseResult {

    private Integer code;
    private String msg;
    private Object data;

    public responseResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    // 运行成功静态方法
    public static responseResult success() {
        return new responseResult(200, "success!", null);
    }

    // 运行成功重载方法
    public static responseResult success(Object data) {
        return new responseResult(200, "success!", data);
    }

    // 运行错误方法
    public static responseResult error() {
        return new responseResult(500, "error!", null);
    }

    public static responseResult error(String msg) {
        return new responseResult(500, "error!", msg);
    }
}
