package com.zsf.freemark.devfreemarkdemo.common.utils;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 全局异常处理
 *
 * @param
 * @author zsf
 * @date 2019/11/18
 * @return
 */

@ControllerAdvice
public class MySister {


    @ExceptionHandler(value = MyExecption.class)
    private Object execue(MyExecption execption) {
        String code = execption.getCode();
        String desc = execption.getDesc();
        System.out.println(code + ";" + desc);
        return "error";
    }

}
