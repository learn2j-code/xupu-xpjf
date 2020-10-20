package com.dlm.xpjf.bam_basemanagement.vo;

import java.util.List;

import com.dlm.xpjf.pojo.HouseholdInfo;
import com.dlm.xpjf.pojo.HouseholdMember;

public class HouseholdVo {
	private HouseholdInfo householdInfo;
	private List<HouseholdMember> householdMemberList;
	public HouseholdInfo getHouseholdInfo() {
		return householdInfo;
	}
	public void setHouseholdInfo(HouseholdInfo householdInfo) {
		this.householdInfo = householdInfo;
	}
	public List<HouseholdMember> getHouseholdMemberList() {
		return householdMemberList;
	}
	public void setHouseholdMemberList(List<HouseholdMember> householdMemberList) {
		this.householdMemberList = householdMemberList;
	}
}
