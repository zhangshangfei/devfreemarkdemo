package com.zsf.freemark.devfreemarkdemo.usermanager.service;


import com.zsf.freemark.devfreemarkdemo.usermanager.model.UserModel;

public interface UserService{

    public UserModel findByUserNameAndPwd (String userName, String passWord) throws Exception;
}
