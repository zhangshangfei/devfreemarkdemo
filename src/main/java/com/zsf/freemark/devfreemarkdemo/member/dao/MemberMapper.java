package com.zsf.freemark.devfreemarkdemo.member.dao;

import com.zsf.freemark.devfreemarkdemo.member.model.MemberModel;
import org.apache.ibatis.annotations.Mapper;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Map;

/**
 * 功能描述 会员dao接口
 * @author zsf
 * @date 2019/6/20
 * @param
 * @return
 */
@Mapper
public interface MemberMapper {

    /**
     * 功能描述 查询会员列表
     * @author zsf
     * @date 2019/6/20
     * @param
     * @return java.util.List<java.lang.reflect.Member>
     */
    List<Map<String,Object>> queryList();

    /**
     * 功能描述 修改状态
     * @author zsf
     * @date 2019/6/20
     * @param
     * @return void
     */
    void updateStatus(String status, String memberId);

    /**
     * 功能描述 根据会员id查询会员信息
     * @author zsf
     * @date 2019/6/21
     * @param
     * @return com.zsf.freemark.devfreemarkdemo.member.model.MemberModel
     */
    MemberModel queryByMemberId(String memberId);

    /**
     * 功能描述 保存会员信息
     * @author zsf
     * @date 2019/6/21
     * @param
     * @return void
     */
    void saveMemberInfo(MemberModel member);

    /**
     * 功能描述 修改会员信息
     * @author zsf
     * @date 2019/6/21
     * @param
     * @return void
     */
    void updateMemberInfo(MemberModel member);
}
