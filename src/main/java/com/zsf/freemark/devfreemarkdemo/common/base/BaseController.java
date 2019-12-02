package com.zsf.freemark.devfreemarkdemo.common.base;



import com.google.gson.Gson;
import com.zsf.freemark.devfreemarkdemo.common.utils.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述 基类
 * @author zsf
 * @date 2019/6/21
 * @param
 * @return
 */
@ControllerAdvice
public class BaseController {


    private String AJAX_HEADER = "X-Requested-With";

    @Resource
    protected HttpServletRequest request;

    @Resource
    protected HttpServletResponse response;

    @ExceptionHandler(value = Exception.class)
    public String handleException(Exception e) throws ServletException, IOException {
        e.printStackTrace();
        String ajaxHeader = "";
        if(StringUtils.isEmpty(ajaxHeader)){
            return "/error";
        }else{
            response.getWriter().write(new Gson().toJson(ERROR("服务异常")));
            response.getWriter().flush();
        }
        return null;
    }

    public Object SUCCESS(Object data){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("result", "success");
        result.put("data", data);
        return result;
    }

    public Object SUCCESS(){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("result", "success");
        return result;
    }

    public Object ERROR(String desc){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("result", "fail");
        result.put("data", desc);
        return result;
    }

}
