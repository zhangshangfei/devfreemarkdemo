package com.zsf.freemark.devfreemarkdemo.member.service;

import com.zsf.freemark.devfreemarkdemo.common.utils.StringUtils;
import com.zsf.freemark.devfreemarkdemo.member.dao.MemberMapper;
import com.zsf.freemark.devfreemarkdemo.member.model.MemberModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.lang.reflect.Member;
import java.util.List;
import java.util.Map;

/**
 * 功能描述 会员业务接口实现类
 * @author zsf
 * @date 2019/6/20
 * @param
 * @return
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberMapper memberDao;

    /**
     * 功能描述 查询会员列表
     * @author zsf
     * @date 2019/6/20
     * @param
     * @return java.util.List<java.lang.reflect.Member>
     */
    @Transactional(readOnly = true,rollbackFor = Exception.class)
    @Override
    public List<Map<String,Object>> queryList()throws Exception {
        return memberDao.queryList();
    }

    /**
     * 功能描述 修改状态
     * @author zsf
     * @date 2019/6/20
     * @param
     * @return void
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateStatus(String status, String memberId)throws Exception {
        memberDao.updateStatus(status, memberId);
    }

    /**
     * 功能描述 根据会员id查询会员信息
     * @author zsf
     * @date 2019/6/21
     * @param
     * @return com.zsf.freemark.devfreemarkdemo.member.model.MemberModel
     */
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    @Override
    public MemberModel queryByMemberId(String memberId)throws Exception {
        return memberDao.queryByMemberId(memberId);
    }

    /**
     * 功能描述 保存或修改信息
     *
     * @param member
     * @return void
     * @author zsf
     * @date 2019/6/21
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveOrUpdateMemberInfo(MemberModel member)throws Exception {
        if (StringUtils.isEmpty(member.getId())){
            memberDao.saveMemberInfo(member);
        }else {
            memberDao.updateMemberInfo(member);
        }

    }
}
