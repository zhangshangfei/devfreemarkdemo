package com.zsf.freemark.devfreemarkdemo.usermanager.service;

import com.zsf.freemark.devfreemarkdemo.usermanager.dao.UserMapper;
import com.zsf.freemark.devfreemarkdemo.usermanager.model.UserModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public UserModel findByUserNameAndPwd(String userName, String passWord) throws Exception {
        return userMapper.findByUserNameAndPwd(userName,passWord);
    }
}
