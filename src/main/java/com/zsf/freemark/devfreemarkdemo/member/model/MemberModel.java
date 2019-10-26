package com.zsf.freemark.devfreemarkdemo.member.model;

import com.zsf.freemark.devfreemarkdemo.common.base.BaseController;
import com.zsf.freemark.devfreemarkdemo.common.base.Constant;

import java.util.Date;

/**
 * 功能描述 会员信息
 * @author zsf
 * @date 2019/6/20
 * @param
 * @return
 */
public class MemberModel {

    private int id;

    /**
     * 备用 微信ID 微信头像 微信昵称
     */
    private String wxOpenId;
    private String wxHeadIcon;
    private String wxNickname;


    /**
     * 等级
     */
    private int grade;
    /**
     * 账户余额
     */
    private double balance;
    /**
     * 升级VIP时间
     */
    private Date VIPTime;

    /**
     * 账户支付密码
     */
    private String withdrawalPassword;

    /*
     * 完善会员信息
     */
    private String nickName;
    private String mobile;
    private Integer gender;
    private String email;
    private String password;
    private String passwordHint;

    private String createId;
    private String createName;
    private Date createTime;
    private Integer status;

    private String updateUserId;
    private String updateUserName;
    private Date updateTime;

    private String remark;

    public String getStatusName(){
        return Constant.statusMap.get(this.status);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    public String getWxHeadIcon() {
        return wxHeadIcon;
    }

    public void setWxHeadIcon(String wxHeadIcon) {
        this.wxHeadIcon = wxHeadIcon;
    }

    public String getWxNickname() {
        return wxNickname;
    }

    public void setWxNickname(String wxNickname) {
        this.wxNickname = wxNickname;
    }

    public int getGrade() {
        return grade;
    }

    public String getGradeName(){
        return Constant.memberGenderMap.get(this.grade);
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getVIPTime() {
        return VIPTime;
    }

    public void setVIPTime(Date VIPTime) {
        this.VIPTime = VIPTime;
    }

    public String getWithdrawalPassword() {
        return withdrawalPassword;
    }

    public void setWithdrawalPassword(String withdrawalPassword) {
        this.withdrawalPassword = withdrawalPassword;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }

    @Override
    public String toString() {
        return "MemberModel{" +
                "id='" + id + '\'' +
                ", wxOpenId='" + wxOpenId + '\'' +
                ", wxHeadIcon='" + wxHeadIcon + '\'' +
                ", wxNickname='" + wxNickname + '\'' +
                ", grade=" + grade +
                ", balance=" + balance +
                ", VIPTime=" + VIPTime +
                ", withdrawalPassword='" + withdrawalPassword + '\'' +
                ", nickName='" + nickName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                '}';
    }
}
