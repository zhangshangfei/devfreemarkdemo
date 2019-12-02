package com.zsf.freemark.devfreemarkdemo.common.utils;

/**
 * 异常处理类
 * @author zsf
 * @date 2019/11/18
 * @param
 * @return
 */
public class MyExecption extends RuntimeException{


    public String code;
    public String desc;

    public MyExecption(){
        super();
    }

    public MyExecption(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
