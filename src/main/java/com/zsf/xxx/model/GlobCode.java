package com.zsf.xxx.model;

import java.util.Date;

public class GlobCode {
    private Long id;

    private String code;

    private String name;

    private Integer value;

    private Integer createid;

    private String createname;

    private Date createtime;

    private Integer updateuserid;

    private String updateusername;

    private Date updatetime;

    private Integer status;

    private String remark;

    public GlobCode(Long id, String code, String name, Integer value, Integer createid, String createname, Date createtime, Integer updateuserid, String updateusername, Date updatetime, Integer status, String remark) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.value = value;
        this.createid = createid;
        this.createname = createname;
        this.createtime = createtime;
        this.updateuserid = updateuserid;
        this.updateusername = updateusername;
        this.updatetime = updatetime;
        this.status = status;
        this.remark = remark;
    }

    public GlobCode() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
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