package com.dlm.xpjf.bam_basemanagement.vo;

import java.util.List;

import com.dlm.xpjf.pojo.HouseholdInfo;
import com.dlm.xpjf.pojo.HouseholdMember;
import com.dlm.xpjf.pojo.UserInfo;

public class UserInfoExtends extends UserInfo {
	private List<HouseholdMember> householdMemberList;
	public List<HouseholdMember> getHouseholdMemberList() {
		return householdMemberList;
	}
	public void setHouseholdMemberList(List<HouseholdMember> householdMemberList) {
		this.householdMemberList = householdMemberList;
	}
}
