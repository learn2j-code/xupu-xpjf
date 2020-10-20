package com.dlm.xpjf.bam_basemanagement.vo;

public class CreateFamilyCondition {
	private String openid;//wx openid
	private Integer householdId;//家庭id
	private String householdName;//家庭名称
	private String headimgurl;//头像地址
	private String surname;//姓
	private String secname;//名
	private Integer gender;//1:男；2：女
	private Integer marriageFlag;//0：未婚；1：已婚
	private String spouseSurname;//配偶姓
	private String spouseSecname;//配偶名讳
	private Integer childNumber;//子女数量
	private String introduction;//简介
	private Integer hasReadFlag;//0:未读，1：已读
	public String getHeadimgurl() {
		return headimgurl;
	}
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSecname() {
		return secname;
	}
	public void setSecname(String secname) {
		this.secname = secname;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Integer getMarriageFlag() {
		return marriageFlag;
	}
	public void setMarriageFlag(Integer marriageFlag) {
		this.marriageFlag = marriageFlag;
	}
//	public Integer getMarrigeRelation() {
//		return marrigeRelation;
//	}
//	public void setMarrigeRelation(Integer marrigeRelation) {
//		this.marrigeRelation = marrigeRelation;
//	}
	public String getSpouseSurname() {
		return spouseSurname;
	}
	public void setSpouseSurname(String spouseSurname) {
		this.spouseSurname = spouseSurname;
	}
	public String getSpouseSecname() {
		return spouseSecname;
	}
	public void setSpouseSecname(String spouseSecname) {
		this.spouseSecname = spouseSecname;
	}
	public Integer getChildNumber() {
		return childNumber;
	}
	public void setChildNumber(Integer childNumber) {
		this.childNumber = childNumber;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
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
		this.householdName = householdName;
	}
	public Integer getHasReadFlag() {
		return hasReadFlag;
	}
	public void setHasReadFlag(Integer hasReadFlag) {
		this.hasReadFlag = hasReadFlag;
	}
	
	
}
