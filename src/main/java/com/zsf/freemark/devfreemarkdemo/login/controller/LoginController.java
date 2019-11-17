package com.zsf.freemark.devfreemarkdemo.login.controller;

import com.zsf.freemark.devfreemarkdemo.common.base.BaseController;
import com.zsf.freemark.devfreemarkdemo.common.base.Constant;
import com.zsf.freemark.devfreemarkdemo.usermanager.model.UserModel;
import com.zsf.freemark.devfreemarkdemo.usermanager.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Resource
    private UserService userService;

    // 访问路径为"",或者为login都跳转到指定页面
    @RequestMapping({"","login"})
    public Object login(ModelMap modelMap, @RequestParam Map<String, String> map){
        System.out.println(map);
        Map<String, Object> resultMap = new HashMap<>();
        // String userName = request.getParameter("userName");
        // String passWord = request.getParameter("passWord");
        String userName = map.get("userName");
        String passWord = map.get("passWord");

        logger.info("LoginController-login: userName = " + userName +"; passWord = " + passWord);

        UserModel user = null;
        try {
            user = userService.findByUserNameAndPwd(userName,passWord);
            if (user != null){
                resultMap.put("nickName",user.getNickName());
                resultMap.put("status", Constant.MODEL_STATUS_SUCCESS);
                modelMap.addAttribute("resultData",resultMap);
                return "index";
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("LoginController-login  登录失败");
        }

        resultMap.clear();
        resultMap.put("status", Constant.MODEL_STATUS_FILED);
        resultMap.put("msg", "用户名或密码错误!");
        modelMap.addAttribute("resultData",resultMap);
        return "login";
    }

    @RequestMapping("home")
    public Object home(ModelMap modelMap,String nickName){
        logger.info("LoginController-home");
        modelMap.addAttribute("nickName",nickName);
        return "home";
    }
}
