package com.zsf.freemark.devfreemarkdemo.usermanager.dao;

import com.zsf.freemark.devfreemarkdemo.usermanager.model.UserModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    UserModel findByUserNameAndPwd(String userName, String passWord);
}
