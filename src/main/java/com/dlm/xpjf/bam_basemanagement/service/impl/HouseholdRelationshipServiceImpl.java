package com.dlm.xpjf.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.xpjf.bam_basemanagement.service.ArticleInfoService;
import com.dlm.xpjf.bam_basemanagement.service.HouseholdRelationshipService;
import com.dlm.xpjf.constant.CommonConstant;
import com.dlm.xpjf.mapper.ArticleInfoMapper;
import com.dlm.xpjf.mapper.HouseholdRelationshipMapper;
import com.dlm.xpjf.pojo.ArticleInfo;
import com.dlm.xpjf.pojo.ArticleInfoExample;
import com.dlm.xpjf.pojo.HouseholdRelationship;
import com.dlm.xpjf.pojo.HouseholdRelationshipExample;

@Service
public class HouseholdRelationshipServiceImpl implements HouseholdRelationshipService {
	@Autowired
	HouseholdRelationshipMapper mapper;

	@Override
	public List<HouseholdRelationship> list() {
		HouseholdRelationshipExample example = new HouseholdRelationshipExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(HouseholdRelationship record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(HouseholdRelationship record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public HouseholdRelationship get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public void deleteHouseholdRelationshipByMaId(Integer maId) {
		HouseholdRelationshipExample example = new HouseholdRelationshipExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andMaIdEqualTo(maId);
		mapper.deleteByExample(example);
	}

	@Override
	public Integer findMbIdByMaId(Integer maId, Integer relationshipType) {
		HouseholdRelationshipExample example = new HouseholdRelationshipExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andMaIdEqualTo(maId).andRelationshipTypeEqualTo(relationshipType);
		List<HouseholdRelationship> householdRelationship = mapper.selectByExample(example);
		if(householdRelationship!=null&&householdRelationship.size()==1) {
			return householdRelationship.get(0).getMbId();
		}
		return null;
	}

	@Override
	public String getRelationListById(Integer id) {
		String relationList = id+"";
		while(id!=null) {
			Integer fatherId = findMbIdByMaId(id,CommonConstant.RELATIONSHIP_CHILD_FATHER);
			if(fatherId!=null) {
				relationList += "-"+fatherId;
			}
			id = fatherId;
		}
		return relationList;
	}

	@Override
	public List<Integer> findMaIdListByMbId(Integer mbId, Integer relationshipType) {
		HouseholdRelationshipExample example = new HouseholdRelationshipExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andMbIdEqualTo(mbId).andRelationshipTypeEqualTo(relationshipType);
		List<HouseholdRelationship> householdRelationshipList = mapper.selectByExample(example);
		List<Integer> maIdList = new ArrayList<Integer>();
		for(HouseholdRelationship householdRelationship:householdRelationshipList) {
			maIdList.add(householdRelationship.getMaId());
		}
		return maIdList;
	}
}
