package com.dlm.xpjf.bam_basemanagement.service;

import java.util.List;

import com.dlm.xpjf.pojo.ArticleInfo;
import com.dlm.xpjf.pojo.HouseholdRelationship;


public interface HouseholdRelationshipService {
	List<HouseholdRelationship> list();
	void add(HouseholdRelationship record);
	void update(HouseholdRelationship record);
	void delete(int id);
	HouseholdRelationship get(int id);
	
	void deleteHouseholdRelationshipByMaId(Integer maId);
	
	Integer findMbIdByMaId(Integer maId, Integer relationshipType);
	
	//查子女或配偶列表
	List<Integer> findMaIdListByMbId(Integer mbId, Integer relationshipType);
	
	//根据传入id查询得到关系路由
	String getRelationListById(Integer id);
}
