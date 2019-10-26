package com.zsf.xxx.model;

import java.util.Date;

public class User {
    private Long id;

    private String username;

    private String password;

    private String passwordhint;

    private String nickname;

    private String mobile;

    private Date createtime;

    private Integer createid;

    private String createname;

    private Integer updateuserid;

    private String updateusername;

    private Date updatetime;

    private Integer status;

    private String remark;

    public User(Long id, String username, String password, String passwordhint, String nickname, String mobile, Date createtime, Integer createid, String createname, Integer updateuserid, String updateusername, Date updatetime, Integer status, String remark) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.passwordhint = passwordhint;
        this.nickname = nickname;
        this.mobile = mobile;
        this.createtime = createtime;
        this.createid = createid;
        this.createname = createname;
        this.updateuserid = updateuserid;
        this.updateusername = updateusername;
        this.updatetime = updatetime;
        this.status = status;
        this.remark = remark;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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