package com.dlm.xpjf.pojo;

import java.util.Date;

public class HouseholdMember {
    private Integer id;

    private String memberSurname;

    private String memberName;

    private String memberNickname;

    private Integer gender;

    private Integer mainFlag;

    private String phone;

    private String birthdayTime;

    private Integer householdId;

    private String householdName;

    private String headImgUrl;

    private String memberDetail;

    private Integer userId;

    private Integer fatherId;

    private String fatherName;

    private Integer motherId;

    private String motherName;

    private Integer spouseId;

    private String spouseName;

    private Integer married;

    private String relationList;

    private Date createTime;

    private Date updateTime;

    private String introduction;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemberSurname() {
        return memberSurname;
    }

    public void setMemberSurname(String memberSurname) {
        this.memberSurname = memberSurname == null ? null : memberSurname.trim();
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getMemberNickname() {
        return memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname == null ? null : memberNickname.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getMainFlag() {
        return mainFlag;
    }

    public void setMainFlag(Integer mainFlag) {
        this.mainFlag = mainFlag;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getBirthdayTime() {
        return birthdayTime;
    }

    public void setBirthdayTime(String birthdayTime) {
        this.birthdayTime = birthdayTime == null ? null : birthdayTime.trim();
    }

    public Integer getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(Integer householdId) {
        this.householdId = householdId;
    }

    public String getHouseholdName() {
        return householdName;
    }

    public void setHouseholdName(String householdName) {
        this.householdName = householdName == null ? null : householdName.trim();
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl == null ? null : headImgUrl.trim();
    }

    public String getMemberDetail() {
        return memberDetail;
    }

    public void setMemberDetail(String memberDetail) {
        this.memberDetail = memberDetail == null ? null : memberDetail.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName == null ? null : fatherName.trim();
    }

    public Integer getMotherId() {
        return motherId;
    }

    public void setMotherId(Integer motherId) {
        this.motherId = motherId;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName == null ? null : motherName.trim();
    }

    public Integer getSpouseId() {
        return spouseId;
    }

    public void setSpouseId(Integer spouseId) {
        this.spouseId = spouseId;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName == null ? null : spouseName.trim();
    }

    public Integer getMarried() {
        return married;
    }

    public void setMarried(Integer married) {
        this.married = married;
    }

    public String getRelationList() {
        return relationList;
    }

    public void setRelationList(String relationList) {
        this.relationList = relationList == null ? null : relationList.trim();
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

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}