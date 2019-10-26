package com.zsf.freemark.devfreemarkdemo.common.base;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述 常量
 * @author zsf
 * @date 2019/6/18
 * @param
 * @return
 */
public interface Constant {


    /**
     * 0禁用 1启用
     */
    public int MODEL_STATUS_DISABLE     = 0;
    public int MODEL_STATUS_ENABLE      = 1;
    public Map<Integer, String> statusMap = new HashMap<Integer, String>(){{
        put(0,"已停用");put(1,"已启用");
    }};

    /**
     * 0失败 1成功
     */
    public int MODEL_STATUS_FILED       = 0;
    public int MODEL_STATUS_SUCCESS     = 1;

    /**
     * 会员表：性别 0男 1女
     */
    public int MEMBER_GENDER_MALE 		= 0;
    public int MEMBER_GENDER_FEMALE 	= 1;
    public Map<Integer, String> memberGenderMap = new HashMap<Integer, String>(){{
        put(0,"男");put(1,"女");
    }};







}
