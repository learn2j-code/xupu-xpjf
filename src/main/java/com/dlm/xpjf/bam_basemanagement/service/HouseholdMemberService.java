package com.dlm.xpjf.bam_basemanagement.service;

import java.util.List;

import com.dlm.xpjf.bam_basemanagement.vo.CreateFamilyCondition;
import com.dlm.xpjf.bam_basemanagement.vo.HouseholdVo;
import com.dlm.xpjf.bam_basemanagement.vo.NewHouseholdMemberVo;
import com.dlm.xpjf.pojo.HouseholdMember;


public interface HouseholdMemberService {
	List<HouseholdMember> list();
	void add(HouseholdMember record);
	void update(HouseholdMember record);
	void delete(int id);
	HouseholdMember get(int id);
	
	//根据家庭id查询家庭成员列表
	List<HouseholdMember> findHouseholdMemberListByHouseholdId(Integer householdId);
	
	//根据用户id查询家庭成员列表
	List<HouseholdMember> findHouseholdMemberListByUserId(Integer userId);
	
	//新增家庭成员--添加关系逻辑
	void addHouseholdMember(HouseholdMember record);
	
	//编辑家庭成员--修改关系逻辑
	void updateHouseholdMember(HouseholdMember record);
	
	//将一个家庭中的每个人到头节点的关系路由运算出来
	void updateRelationListByHouseholdId(Integer householdId);
	
	//根据头节点查询其配偶及其子女列表
	NewHouseholdMemberVo findNewHouseholdMemberVoByHeadId(Integer headId);
	
	//根据idList 查询成员列表
	List<HouseholdMember> findHouseholdMemberListByIdList(List<Integer> idList);
	
	//通过创建家庭条件
	HouseholdVo createHouseholdMemberListBy(CreateFamilyCondition condition);
	
	//根据头节点查询其下所有的子女和配偶
	List<HouseholdMember> findHouseholdMemberListByHeadId(Integer headId, Integer num);
}
