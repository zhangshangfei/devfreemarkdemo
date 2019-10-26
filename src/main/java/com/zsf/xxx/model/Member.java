package com.zsf.xxx.model;

import java.util.Date;

public class Member {
    private Long id;

    private String email;

    private String password;

    private String passwordhint;

    private String nickname;

    private Integer gender;

    private String mobile;

    private Integer grade;

    private Double balance;

    private Date viptime;

    private String withdrawalpassword;

    private Integer createid;

    private String createname;

    private Date createtime;

    private Integer updateuserid;

    private String updateusername;

    private Date updatetime;

    private Integer status;

    private String remark;

    public Member(Long id, String email, String password, String passwordhint, String nickname, Integer gender, String mobile, Integer grade, Double balance, Date viptime, String withdrawalpassword, Integer createid, String createname, Date createtime, Integer updateuserid, String updateusername, Date updatetime, Integer status, String remark) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.passwordhint = passwordhint;
        this.nickname = nickname;
        this.gender = gender;
        this.mobile = mobile;
        this.grade = grade;
        this.balance = balance;
        this.viptime = viptime;
        this.withdrawalpassword = withdrawalpassword;
        this.createid = createid;
        this.createname = createname;
        this.createtime = createtime;
        this.updateuserid = updateuserid;
        this.updateusername = updateusername;
        this.updatetime = updatetime;
        this.status = status;
        this.remark = remark;
    }

    public Member() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPasswordhint() {
        return passwordhint;
    }

    public void setPasswordhint(String passwordhint) {
        this.passwordhint = passwordhint == null ? null : passwordhint.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getViptime() {
        return viptime;
    }

    public void setViptime(Date viptime) {
        this.viptime = viptime;
    }

    public String getWithdrawalpassword() {
        return withdrawalpassword;
    }

    public void setWithdrawalpassword(String withdrawalpassword) {
        this.withdrawalpassword = withdrawalpassword == null ? null : withdrawalpassword.trim();
    }

    public Integer getCreateid() {
        return createid;
    }

    public void setCreateid(Integer createid) {
        this.createid = createid;
    }

    public String getCreatename() {
        return createname;
    }

    public void setCreatename(String createname) {
        this.createname = createname == null ? null : createname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(Integer updateuserid) {
        this.updateuserid = updateuserid;
    }

    public String getUpdateusername() {
        return updateusername;
    }

    public void setUpdateusername(String updateusername) {
        this.updateusername = updateusername == null ? null : updateusername.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}