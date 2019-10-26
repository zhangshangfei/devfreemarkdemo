package com.zsf.freemark.devfreemarkdemo.member.service;

import com.zsf.freemark.devfreemarkdemo.member.model.MemberModel;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Map;

/**
 * 功能描述 会员业务接口
 * @author zsf
 * @date 2019/6/20
 * @param
 * @return
 */
public interface MemberService {

    /**
     * 功能描述 查询会员列表
     * @author zsf
     * @date 2019/6/20
     * @param
     * @return java.util.List<java.lang.reflect.Member>
     */
    List<Map<String,Object>> queryList() throws Exception;

    /**
     * 功能描述 修改状态
     * @author zsf
     * @date 2019/6/20
     * @param
     * @return void
     */
    void updateStatus(String status, String memberId) throws Exception;

    /**
     * 功能描述 根据id查询会员信息
     * @author zsf
     * @date 2019/6/21
     * @param
     * @return com.zsf.freemark.devfreemarkdemo.member.model.MemberModel
     */
    MemberModel queryByMemberId(String memberId) throws Exception;

    /**
     * 功能描述 保存或修改信息
     * @author zsf
     * @date 2019/6/21
     * @param
     * @return void
     */
    void saveOrUpdateMemberInfo(MemberModel member) throws Exception;
}
