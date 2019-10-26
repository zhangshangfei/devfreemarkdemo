package com.zsf.freemark.devfreemarkdemo.common.base;

import java.util.Date;

/**
 * 功能描述 公共属性
 * @author zsf
 * @date 2019/6/20
 * @param
 * @return
 */
public class BaseModel {

    private String id;

    private String createId;
    private String createName;
    private Date createTime;
    private Integer status;

    // 修改信息
    private String updateUserId;
    private String updateUserName;
    private Date updateTime;

    private String remark;
    
    public String getStatusName(){
        String result = "启用";
        if (status != null){
            if (status == Constant.MODEL_STATUS_DISABLE){
                result = "禁用";
            }else if(status == Constant.MODEL_STATUS_ENABLE){
                result  = "启用";
            }else {}
        }
        return result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
}
