package com.rambo.demo.common;

/**
 * 统一返回模型工具类
 * User: za-panyong
 * Date: 2018/10/29
 * Time: 18:11
 */
public class BaseResultUtil {
    public static <T> BaseResult<T> ok(){
        return new BaseResult();
    }

    public static <T> BaseResult<T> ok(T result){
        BaseResult ret = new BaseResult();
        ret.setResult(result);

        return ret;
    }

    public static <T> BaseResult<T> error() {
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(500);
        baseResult.setMsg("异常测试");

        return baseResult;
    }
}
