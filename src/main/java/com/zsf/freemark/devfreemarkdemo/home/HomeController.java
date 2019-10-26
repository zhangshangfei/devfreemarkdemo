package com.zsf.freemark.devfreemarkdemo.home;

import com.zsf.freemark.devfreemarkdemo.common.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 功能描述 首页信息
 * @author zsf
 * @date 2019/6/20
 * @param  
 * @return 
 */
@Controller
@RequestMapping("home")
public class HomeController extends BaseController {

    /**
     * 功能描述 汇总首页数据
     * @author zsf
     * @date 2019/6/20
     * @param
     * @return java.lang.Object
     */
    @RequestMapping("dataStatistics")
    @ResponseBody
    public Object dataStatistics(ModelMap modelMap){

        return SUCCESS();
    }
    
}
