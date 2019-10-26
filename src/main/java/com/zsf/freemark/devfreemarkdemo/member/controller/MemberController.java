package com.zsf.freemark.devfreemarkdemo.member.controller;

import com.zsf.freemark.devfreemarkdemo.common.base.BaseController;
import com.zsf.freemark.devfreemarkdemo.member.model.MemberModel;
import com.zsf.freemark.devfreemarkdemo.member.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.lang.reflect.Member;
import java.util.List;
import java.util.Map;

/**
 * 功能描述 会员管理
 * @author zsf
 * @date 2019/6/20
 * @param
 * @return
 */
@Controller
@RequestMapping("member")
public class MemberController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

    @Resource
    private MemberService memberService;

    /**
     * 功能描述 查询会员列表
     * @author zsf
     * @date 2019/6/20
     * @param
     * @return java.lang.Object
     */
    @RequestMapping("memberList")
    public Object memberList(ModelMap modelMap){
        List<Map<String,Object>> list = null;
        try {
            list = memberService.queryList();
            logger.info("MemberController-memberList : list = " + list);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("MemberController-memberList 异常");
        }
        modelMap.addAttribute("list",list);
        return "member/memberList";
    }

    /**
     * 功能描述 修改会员状态
     * @author zsf
     * @date 2019/6/21
     * @param
     * @return java.lang.Object
     */
    @RequestMapping(value = "updateStatus", method = RequestMethod.POST)
    @ResponseBody
    public Object updateStatus(ModelMap modelMap, String status, String memberId){
        logger.info("MemberController-updateStatus : memberId = " + memberId);
        try {
            memberService.updateStatus(status,memberId);
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR("修改失败!");
        }
        return SUCCESS();
    }

    /**
     * 功能描述 跳转到编辑页面
     * @author zsf
     * @date 2019/6/21
     * @param
     * @return java.lang.Object
     */
    @RequestMapping("editMemberInfo")
    public Object editMemberInfo(ModelMap modelMap,String memberId){
        logger.info("MemberController-editMemberInfo : memberId = " + memberId);
        MemberModel memberModel = null;
        try {
            memberModel = memberService.queryByMemberId(memberId);
            logger.info("MemberController-editMemberInfo : memberModel = " + memberModel);
            modelMap.addAttribute("member",memberModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "member/memberEdit";
    }

    /**
     * 功能描述 保存或修改信息
     * @author zsf
     * @date 2019/6/21
     * @param
     * @return java.lang.Object
     */
    @RequestMapping(value = "saveOrUpdateMemberInfo", method = RequestMethod.POST)
    @ResponseBody
    public Object saveOrUpdateMemberInfo(ModelMap modelMap,MemberModel member){
        member.setPasswordHint(member.getPassword());
        logger.info("MemberController-updateMemberInfo : member = " + member);
        try {
            memberService.saveOrUpdateMemberInfo(member);
        } catch (Exception e) {
            e.printStackTrace();
            return  ERROR("操作失败!");
        }
        return SUCCESS();
    }


    /**
     * 功能描述 跳转到修改面页面(未写逻辑)
     * @author zsf
     * @date 2019/6/21
     * @param
     * @return java.lang.Object
     */
    @RequestMapping("editMemberPassword")
    public Object editMemberPassword(ModelMap modelMap,String memberId){
        logger.info("MemberController-editMemberPassword : memberId = " + memberId);
        return "member/memberPassword";
    }

}
