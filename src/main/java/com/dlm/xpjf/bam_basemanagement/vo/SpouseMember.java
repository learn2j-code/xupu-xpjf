package com.dlm.xpjf.bam_basemanagement.vo;

import java.util.List;

import com.dlm.xpjf.pojo.HouseholdMember;

public class SpouseMember {
	private HouseholdMember spouseNode;
	private List<HouseholdMember> childList;

	public List<HouseholdMember> getChildList() {
		return childList;
	}

	public void setChildList(List<HouseholdMember> childList) {
		this.childList = childList;
	}

	public HouseholdMember getSpouseNode() {
		return spouseNode;
	}

	public void setSpouseNode(HouseholdMember spouseNode) {
		this.spouseNode = spouseNode;
	}
}
