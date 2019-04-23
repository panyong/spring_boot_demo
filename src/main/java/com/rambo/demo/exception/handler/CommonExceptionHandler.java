package com.rambo.demo.exception.handler;

import com.rambo.demo.common.BaseResult;
import com.rambo.demo.common.BaseResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 通用异常处理类
 * User: za-panyong
 * Date: 2018/10/29
 * Time: 18:09
 * @author panyong
 */
@ControllerAdvice
public class CommonExceptionHandler {
    @ExceptionHandler({Exception.class})
    @ResponseBody
    public <T> BaseResult<T> baseExceptionHandler(){
        return BaseResultUtil.error();
    }
}
