package com.zsf.freemark.devfreemarkdemo.usermanager.controller;

import com.zsf.freemark.devfreemarkdemo.common.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能描述 用户管理
 * @author zsf
 * @date 2019/6/19
 * @param
 * @return
 */
@Controller
@RequestMapping("user")
public class UserManagerController extends BaseController {

    @RequestMapping("userReport")
    public Object userReport(ModelMap modelMap){


        return "user/report";
    }


    @RequestMapping("userList")
    public Object userList(ModelMap modelMap ){

        return "user/userList";
    }


}
