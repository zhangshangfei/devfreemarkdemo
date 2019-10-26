package com.zsf.xxx.model;

import java.util.Date;

public class ReceiveAddress {
    private Long id;

    private String receivename;

    private String mobile;

    private String address;

    private Long memberid;

    private Integer defaultfalg;

    private Long createid;

    private String createname;

    private Date createtime;

    private Long updateuserid;

    private String updateusername;

    private Date updatetime;

    private Integer status;

    private String remark;

    public ReceiveAddress(Long id, String receivename, String mobile, String address, Long memberid, Integer defaultfalg, Long createid, String createname, Date createtime, Long updateuserid, String updateusername, Date updatetime, Integer status, String remark) {
        this.id = id;
        this.receivename = receivename;
        this.mobile = mobile;
        this.address = address;
        this.memberid = memberid;
        this.defaultfalg = defaultfalg;
        this.createid = createid;
        this.createname = createname;
        this.createtime = createtime;
        this.updateuserid = updateuserid;
        this.updateusername = updateusername;
        this.updatetime = updatetime;
        this.status = status;
        this.remark = remark;
    }

    public ReceiveAddress() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReceivename() {
        return receivename;
    }

    public void setReceivename(String receivename) {
        this.receivename = receivename == null ? null : receivename.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Long getMemberid() {
        return memberid;
    }

    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    public Integer getDefaultfalg() {
        return defaultfalg;
    }

    public void setDefaultfalg(Integer defaultfalg) {
        this.defaultfalg = defaultfalg;
    }

    public Long getCreateid() {
        return createid;
    }

    public void setCreateid(Long createid) {
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

    public Long getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(Long updateuserid) {
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