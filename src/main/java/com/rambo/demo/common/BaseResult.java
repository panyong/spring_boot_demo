package com.rambo.demo.common;

import lombok.Data;

/**
 * 统一返回模型
 * User: za-panyong
 * Date: 2018/10/29
 * Time: 18:10
 * @author panyong
 */
@Data
public class  BaseResult<T> {
    public static final int SUCCESS_CODE = 200;
    public  static  final String SUCCESS_MSG = "success";
    private int code;
    private String msg;
    private T result;

    public BaseResult() {
        code = SUCCESS_CODE;
        msg = SUCCESS_MSG;
        result = null;
    }

}
