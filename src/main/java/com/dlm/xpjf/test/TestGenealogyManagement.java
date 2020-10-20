package com.dlm.xpjf.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dlm.xpjf.bam_basemanagement.service.HouseholdMemberService;
import com.dlm.xpjf.bam_basemanagement.service.HouseholdRelationshipService;
import com.dlm.xpjf.bam_basemanagement.vo.CreateFamilyCondition;
import com.dlm.xpjf.pojo.HouseholdMember;
import com.dlm.xpjf.util.Page;
import com.github.pagehelper.PageHelper;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestGenealogyManagement {
	
	@Autowired
	HouseholdMemberService householdMemberService;
	
	@Autowired
	HouseholdRelationshipService householdRelationshipService;
//	@Test
	public void findByPage() {
		Page page = new Page();
		int count = 6;
		int num = 1;
		page.setStart(count*(num-1));
		page.setCount(count);
		PageHelper.offsetPage(page.getStart(),page.getCount());
//		int total = (int) new PageInfo<>(userList).getTotal();
//        page.setTotal(total);
	}
	
//	@Test
//	public void createHouseholdMemberListBy() {
//		CreateFamilyCondition condition = new CreateFamilyCondition();
//		condition.setChildNumber(5);
//		condition.setHouseholdId(1);
//		condition.setHouseholdName("李的家庭");
//		condition.setGender(1);
//		condition.setMarriageFlag(1);
//		condition.setSurname("李");
//		condition.setSecname("哈哈");
//		
//		condition.setSpouseSurname("蒋");
//		condition.setSpouseSecname("丽丽");
//		householdMemberService.createHouseholdMemberListBy(condition);
//	}
	@Test
	public void findHouseholdMemberListByHeadId() {
		List<HouseholdMember> list = householdMemberService.findHouseholdMemberListByHeadId(70,3);
		System.out.println(list);
	}

//	@Test
//	public void householdRelationshipService() {
//		householdMemberService.updateRelationListByHouseholdId(1);
//	}
	
}
