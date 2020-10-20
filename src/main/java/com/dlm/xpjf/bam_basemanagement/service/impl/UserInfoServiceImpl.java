package com.dlm.xpjf.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.xpjf.bam_basemanagement.service.HouseholdMemberService;
import com.dlm.xpjf.bam_basemanagement.service.UserInfoService;
import com.dlm.xpjf.bam_basemanagement.vo.UserInfoExtends;
import com.dlm.xpjf.mapper.UserInfoMapper;
import com.dlm.xpjf.pojo.HouseholdMember;
import com.dlm.xpjf.pojo.UserInfo;
import com.dlm.xpjf.pojo.UserInfoExample;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	UserInfoMapper mapper;
	@Autowired
	HouseholdMemberService householdMemberService;
	@Override
	public List<UserInfo> list() {
		UserInfoExample example = new UserInfoExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(UserInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(UserInfo record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public UserInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public UserInfoExtends login(UserInfo record) {
		UserInfo userInfo = findUserInfoByUsername(record.getUsername());
		if(userInfo!=null) {
			if(!record.getPassword().equals(userInfo.getPassword())) {
				return null;
			}
			UserInfoExtends userInfoExtends = new UserInfoExtends();
			BeanUtils.copyProperties(userInfo, userInfoExtends);
			//包装家庭成员信息
			List<HouseholdMember> householdMemberList = householdMemberService.findHouseholdMemberListByUserId(userInfo.getId());
			userInfoExtends.setHouseholdMemberList(householdMemberList);
			return userInfoExtends;
		}
		return null;
	}

	@Override
	public UserInfo findUserInfoByUsername(String username) {
		UserInfoExample example = new UserInfoExample();
		example.setOrderByClause("id desc");
		example.createCriteria().andUsernameEqualTo(username);
		List<UserInfo> list = mapper.selectByExample(example);
		if(list!=null&&list.size()==1) {
			return list.get(0);
		}
		return null;
	}
}
