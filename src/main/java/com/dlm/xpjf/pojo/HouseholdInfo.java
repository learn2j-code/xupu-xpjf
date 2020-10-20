package com.dlm.xpjf.pojo;

import java.util.Date;

public class HouseholdInfo {
    private Integer id;

    private String householdName;

    private String householdDetail;

    private Integer headId;

    private String headName;

    private String openid;

    private Date createTime;

    private Date updateTime;

    private String surname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHouseholdName() {
        return householdName;
    }

    public void setHouseholdName(String householdName) {
        this.householdName = householdName == null ? null : householdName.trim();
    }

    public String getHouseholdDetail() {
        return householdDetail;
    }

    public void setHouseholdDetail(String householdDetail) {
        this.householdDetail = householdDetail == null ? null : householdDetail.trim();
    }

    public Integer getHeadId() {
        return headId;
    }

    public void setHeadId(Integer headId) {
        this.headId = headId;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName == null ? null : headName.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname == null ? null : surname.trim();
    }
}