package com.dlm.xpjf.bam_basemanagement.service;

import java.util.List;

import com.dlm.xpjf.pojo.HouseholdInfo;


public interface HouseholdInfoService {
	List<HouseholdInfo> list();
	void add(HouseholdInfo record);
	void update(HouseholdInfo record);
	void delete(int id);
	HouseholdInfo get(int id);
	
	//根据openid查家庭信息
	List<HouseholdInfo> findHouseholdInfoByOpenid(String openid);
}
