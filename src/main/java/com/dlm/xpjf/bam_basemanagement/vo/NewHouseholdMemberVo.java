package com.dlm.xpjf.bam_basemanagement.vo;

import java.util.List;

import com.dlm.xpjf.pojo.HouseholdMember;

public class NewHouseholdMemberVo {
	private HouseholdMember headNode;
	private List<SpouseMember> spouseMemberList;
	public HouseholdMember getHeadNode() {
		return headNode;
	}
	public void setHeadNode(HouseholdMember headNode) {
		this.headNode = headNode;
	}
	public List<SpouseMember> getSpouseMemberList() {
		return spouseMemberList;
	}
	public void setSpouseMemberList(List<SpouseMember> spouseMemberList) {
		this.spouseMemberList = spouseMemberList;
	}
}
