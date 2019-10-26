package com.zsf.freemark.devfreemarkdemo.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping(value = "user")
    public String test(ModelMap modelMap){
        modelMap.addAttribute("data","123");
        return "index";
    }

}
