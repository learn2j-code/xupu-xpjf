package com.dlm.xpjf.bam_basemanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.xpjf.bam_basemanagement.service.HouseholdInfoService;
import com.dlm.xpjf.bam_basemanagement.service.HouseholdMemberService;
import com.dlm.xpjf.bam_basemanagement.service.HouseholdRelationshipService;
import com.dlm.xpjf.bam_basemanagement.vo.CreateFamilyCondition;
import com.dlm.xpjf.bam_basemanagement.vo.HouseholdVo;
import com.dlm.xpjf.bam_basemanagement.vo.NewHouseholdMemberVo;
import com.dlm.xpjf.bam_basemanagement.vo.SpouseMember;
import com.dlm.xpjf.constant.CommonConstant;
import com.dlm.xpjf.mapper.HouseholdMemberMapper;
import com.dlm.xpjf.pojo.HouseholdInfo;
import com.dlm.xpjf.pojo.HouseholdMember;
import com.dlm.xpjf.pojo.HouseholdMemberExample;
import com.dlm.xpjf.pojo.HouseholdRelationship;

@Service
public class HouseholdMemberServiceImpl implements HouseholdMemberService {
	@Autowired
	HouseholdMemberMapper mapper;

	@Autowired
	HouseholdRelationshipService householdRelationshipService;
	
	@Autowired
	HouseholdInfoService householdInfoService;
	@Override
	public List<HouseholdMember> list() {
		HouseholdMemberExample example = new HouseholdMemberExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(HouseholdMember record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(HouseholdMember record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public HouseholdMember get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<HouseholdMember> findHouseholdMemberListByHouseholdId(Integer householdId) {
		HouseholdMemberExample example = new HouseholdMemberExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andHouseholdIdEqualTo(householdId);
		return mapper.selectByExample(example);
	}

	@Override
	public List<HouseholdMember> findHouseholdMemberListByUserId(Integer userId) {
		HouseholdMemberExample example = new HouseholdMemberExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andUserIdEqualTo(userId);
		return mapper.selectByExample(example);
	}

	@Override
	public void addHouseholdMember(HouseholdMember record) {
		add(record);
		Integer memberId = record.getId();
		//判断成员是主干还是非主干成员
		if(record.getMainFlag()==1) {
			//主
			//先添加与父亲的关系
			if(record.getFatherId()!=null&&record.getFatherId()>0) {
				HouseholdRelationship householdRelationship = new HouseholdRelationship();
				householdRelationship.setHouseholdId(record.getHouseholdId());
				householdRelationship.setMaId(memberId);
				householdRelationship.setMbId(record.getFatherId());
				householdRelationship.setRelationshipType(CommonConstant.RELATIONSHIP_CHILD_FATHER);
				householdRelationshipService.add(householdRelationship);
			}
			//再添加与母亲的关系
			if(record.getMotherId()!=null&&record.getMotherId()>0) {
				HouseholdRelationship householdRelationship = new HouseholdRelationship();
				householdRelationship.setHouseholdId(record.getHouseholdId());
				householdRelationship.setMaId(memberId);
				householdRelationship.setMbId(record.getMotherId());
				householdRelationship.setRelationshipType(CommonConstant.RELATIONSHIP_CHILD_MOTHER);
				householdRelationshipService.add(householdRelationship);
			}
		}else {
			//非主
			//添加与配偶的关系
			if(record.getSpouseId()!=null&&record.getSpouseId()>0) {
				HouseholdRelationship householdRelationship = new HouseholdRelationship();
				householdRelationship.setHouseholdId(record.getHouseholdId());
				householdRelationship.setMaId(memberId);
				householdRelationship.setMbId(record.getSpouseId());
				householdRelationship.setRelationshipType(CommonConstant.RELATIONSHIP_SPOUSE_MAIN);
				householdRelationshipService.add(householdRelationship);
			}
		}
	}

	@Override
	public void updateHouseholdMember(HouseholdMember record) {
		update(record);
		//先删除原有的关系
		householdRelationshipService.deleteHouseholdRelationshipByMaId(record.getId());
		//判断成员是主干还是非主干成员
		if(record.getMainFlag()==1) {
			//主
			//先添加与父亲的关系
			if(record.getFatherId()!=null&&record.getFatherId()>0) {
				HouseholdRelationship householdRelationship = new HouseholdRelationship();
				householdRelationship.setHouseholdId(record.getHouseholdId());
				householdRelationship.setMaId(record.getId());
				householdRelationship.setMbId(record.getFatherId());
				householdRelationship.setRelationshipType(CommonConstant.RELATIONSHIP_CHILD_FATHER);
				householdRelationshipService.add(householdRelationship);
			}
			//再添加与母亲的关系
			if(record.getMotherId()!=null&&record.getMotherId()>0) {
				HouseholdRelationship householdRelationship = new HouseholdRelationship();
				householdRelationship.setHouseholdId(record.getHouseholdId());
				householdRelationship.setMaId(record.getId());
				householdRelationship.setMbId(record.getMotherId());
				householdRelationship.setRelationshipType(CommonConstant.RELATIONSHIP_CHILD_MOTHER);
				householdRelationshipService.add(householdRelationship);
			}
		}else {
			//非主
			//添加与配偶的关系
			if(record.getSpouseId()!=null&&record.getSpouseId()>0) {
				HouseholdRelationship householdRelationship = new HouseholdRelationship();
				householdRelationship.setHouseholdId(record.getHouseholdId());
				householdRelationship.setMaId(record.getId());
				householdRelationship.setMbId(record.getSpouseId());
				householdRelationship.setRelationshipType(CommonConstant.RELATIONSHIP_SPOUSE_MAIN);
				householdRelationshipService.add(householdRelationship);
			}
		}
		
	}

	@Override
	public void updateRelationListByHouseholdId(Integer householdId) {
		List<HouseholdMember> householdMemberList = findHouseholdMemberListByHouseholdId(householdId);
		for(HouseholdMember householdMember:householdMemberList) {
			//先判断成员是否是主干成员
			HouseholdMember newHouseholdMember = new HouseholdMember();
			if(householdMember.getMainFlag()==1) {
				String relationList = householdRelationshipService.getRelationListById(householdMember.getId());
				newHouseholdMember.setId(householdMember.getId());
				newHouseholdMember.setRelationList(relationList);
			}else {
				Integer mainId = householdRelationshipService.findMbIdByMaId(householdMember.getId(), CommonConstant.RELATIONSHIP_SPOUSE_MAIN);
				String relationList = householdRelationshipService.getRelationListById(mainId);
				String newRelationList = householdMember.getId()+"-"+relationList;
				newHouseholdMember.setRelationList(newRelationList);
			}
			newHouseholdMember.setId(householdMember.getId());
			update(newHouseholdMember);
		}
	}

	@Override
	public NewHouseholdMemberVo findNewHouseholdMemberVoByHeadId(Integer headId) {
		NewHouseholdMemberVo newHouseholdMemberVo = new NewHouseholdMemberVo();
		HouseholdMember headNode = get(headId);
		newHouseholdMemberVo.setHeadNode(headNode);
		List<SpouseMember> spouseMemberList = new ArrayList<>();
		// 先查配偶
		List<Integer> spouseIdList = householdRelationshipService.findMaIdListByMbId(headId, CommonConstant.RELATIONSHIP_SPOUSE_MAIN);
		for(Integer spouseId:spouseIdList) {
			SpouseMember spouseMember = new SpouseMember();
			//根据配偶id查子女
			HouseholdMember spouseNode = get(spouseId);
			spouseMember.setSpouseNode(spouseNode);
			List<Integer> childIdList = new ArrayList<>();
			if(headNode.getGender()==1) {
				//如果主节点是男的，则
				childIdList = householdRelationshipService.findMaIdListByMbId(spouseId, CommonConstant.RELATIONSHIP_CHILD_MOTHER);
			}else {
				childIdList = householdRelationshipService.findMaIdListByMbId(headId, CommonConstant.RELATIONSHIP_CHILD_MOTHER);
			}
			if(childIdList!=null&&childIdList.size()>0) {
				List<HouseholdMember> childList = findHouseholdMemberListByIdList(childIdList);
				spouseMember.setChildList(childList);
			}
			spouseMemberList.add(spouseMember);
		}
		newHouseholdMemberVo.setSpouseMemberList(spouseMemberList);
		return newHouseholdMemberVo;
	}

	@Override
	public List<HouseholdMember> findHouseholdMemberListByIdList(List<Integer> idList) {
		HouseholdMemberExample example = new HouseholdMemberExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andIdIn(idList);
		return mapper.selectByExample(example);
	}

	@Override
	public HouseholdVo createHouseholdMemberListBy(CreateFamilyCondition condition) {
		//先创建家庭信息，拿到家庭id
		HouseholdInfo householdInfo = new HouseholdInfo();
		if(condition.getSurname().length()==1) {
			householdInfo.setHouseholdName(condition.getSurname()+"氏家风");
		}else if(condition.getSurname().length()>1) {
			householdInfo.setHouseholdName(condition.getSurname()+"家风");
		}
		householdInfo.setOpenid(condition.getOpenid());
		householdInfo.setSurname(condition.getSurname());
		householdInfoService.add(householdInfo);
		condition.setHouseholdId(householdInfo.getId());
		
		//1、未婚(或已婚，儿女数量为0)，创建祖父母、父母、自己
		if(condition.getMarriageFlag()==0||(condition.getMarriageFlag()==1&&condition.getChildNumber()==0)) {
			HouseholdMember grandFather = packageGrandFather(condition);
			addHouseholdMember(grandFather);
			Integer grandFatherId = grandFather.getId();
			
			HouseholdMember grandMother = packageGrandMother(condition);
			grandMother.setSpouseId(grandFatherId);
			addHouseholdMember(grandMother);
			Integer grandMotherId = grandMother.getId();
			
			HouseholdMember father = packageFather(condition);
			father.setFatherId(grandFatherId);
			father.setMotherId(grandMotherId);
			addHouseholdMember(father);
			Integer fatherId = father.getId();
			
			HouseholdMember mother = packageMother(condition);
			mother.setSpouseId(fatherId);
			addHouseholdMember(mother);
			Integer motherId = mother.getId();
			
			HouseholdMember myself = packageMyself(condition);
			myself.setFatherId(fatherId);
			myself.setMotherId(motherId);
			addHouseholdMember(myself);
			Integer myselfId = myself.getId();
			
			if(condition.getMarriageFlag()==1) {
				HouseholdMember spouse = packageSpouse(condition);
				spouse.setSpouseId(myselfId);;
				addHouseholdMember(spouse);
			}
			
			householdInfo.setHeadId(grandFatherId);
			householdInfo.setHeadName(grandFather.getMemberNickname());
		}
		//2、已婚，儿女数量为1个以上，创建父母、自己、配、子女
		if(condition.getMarriageFlag()==1&&condition.getChildNumber()>0) {
			HouseholdMember father = packageFather(condition);
			addHouseholdMember(father);
			Integer fatherId = father.getId();
			
			HouseholdMember mother = packageMother(condition);
			mother.setSpouseId(fatherId);
			addHouseholdMember(mother);
			Integer motherId = mother.getId();
			
			HouseholdMember myself = packageMyself(condition);
			myself.setFatherId(fatherId);
			myself.setMotherId(motherId);
			addHouseholdMember(myself);
			Integer myselfId = myself.getId();
			
			HouseholdMember spouse = packageSpouse(condition);
			spouse.setSpouseId(myselfId);;
			addHouseholdMember(spouse);
			Integer spouseId = spouse.getId();
			
			Integer childNumber = condition.getChildNumber();
			for(int i=1;i<=childNumber;i++) {
				HouseholdMember child = packageChild(i,condition);
				if(myself.getGender()==1) {
					child.setFatherId(myselfId);
					child.setMotherId(spouseId);
				}else {
					child.setFatherId(spouseId);
					child.setMotherId(myselfId);
				}
				addHouseholdMember(child);
			}
			
			householdInfo.setHeadId(fatherId);
			householdInfo.setHeadName(father.getMemberNickname());
			
		}
		
		HouseholdVo householdVo = new HouseholdVo();
		householdVo.setHouseholdInfo(householdInfo);
		return householdVo;
	}
	
	@Override
	public List<HouseholdMember> findHouseholdMemberListByHeadId(Integer headId, Integer num) {
		List<Integer> mainIdList = new ArrayList<>();
		List<Integer> sonIdTempList = new ArrayList<>();
		List<Integer> memberIdList = new ArrayList<>();
		mainIdList.add(headId);
		memberIdList.add(headId);
		//找所有头id的配偶id
		List<Integer> headSpouseIdList = householdRelationshipService.findMaIdListByMbId(headId,CommonConstant.RELATIONSHIP_SPOUSE_MAIN);
		memberIdList.addAll(headSpouseIdList);
		for(int i=0;i<num;i++){
			List<Integer> sonIdList = new ArrayList<>();
			for(Integer mainId:mainIdList){
				HouseholdMember mainMember = get(mainId);
				if(mainMember.getGender()==1) {
					//父找出所有子代
					sonIdTempList = householdRelationshipService.findMaIdListByMbId(mainId,CommonConstant.RELATIONSHIP_CHILD_FATHER);
					sonIdList.addAll(sonIdTempList);
				}else if(mainMember.getGender()==2) {
					//母找出所有子代
					sonIdTempList = householdRelationshipService.findMaIdListByMbId(mainId,CommonConstant.RELATIONSHIP_CHILD_MOTHER);
					sonIdList.addAll(sonIdTempList);
				}
			}
			memberIdList.addAll(sonIdList);
			for(Integer sonId:sonIdList){
				//找所有子id的配偶id
				List<Integer> spouseIdList = householdRelationshipService.findMaIdListByMbId(sonId,CommonConstant.RELATIONSHIP_SPOUSE_MAIN);
				memberIdList.addAll(spouseIdList);
			}
			mainIdList.clear();
			mainIdList.addAll(sonIdList);	
			sonIdList.clear();
		}
		HouseholdMemberExample example = new HouseholdMemberExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andIdIn(memberIdList);
		return mapper.selectByExample(example);
	}
	
	//祖父亲
	private HouseholdMember packageGrandFather(CreateFamilyCondition condition) {
		HouseholdMember householdMember = new HouseholdMember();
		householdMember.setHouseholdId(condition.getHouseholdId());
		householdMember.setHouseholdName(condition.getHouseholdName());
		householdMember.setGender(1); //1 男 2 女
		householdMember.setFatherId(0);
		householdMember.setMotherId(0);
		householdMember.setMainFlag(1);//1 主干 0 非
		householdMember.setMarried(1);//1 已婚 0 未婚
		householdMember.setMemberNickname("爷爷");
		return householdMember;
	}
	//祖母亲
	private HouseholdMember packageGrandMother(CreateFamilyCondition condition) {
		HouseholdMember householdMember = new HouseholdMember();
		householdMember.setHouseholdId(condition.getHouseholdId());
		householdMember.setHouseholdName(condition.getHouseholdName());
		householdMember.setGender(2); //1 男 2 女
		householdMember.setFatherId(0);
		householdMember.setMotherId(0);
		householdMember.setMainFlag(0);//1 主干 0 非
		householdMember.setMarried(1);//1 已婚 0 未婚
		householdMember.setMemberNickname("奶奶");
		return householdMember;
	}
	//父亲
	private HouseholdMember packageFather(CreateFamilyCondition condition) {
		HouseholdMember householdMember = new HouseholdMember();
		householdMember.setHouseholdId(condition.getHouseholdId());
		householdMember.setHouseholdName(condition.getHouseholdName());
		householdMember.setGender(1); //1 男 2 女
		householdMember.setFatherId(0);
		householdMember.setMotherId(0);
		householdMember.setMainFlag(1);//1 主干 0 非
		householdMember.setMarried(1);//1 已婚 0 未婚
		householdMember.setMemberNickname("爸爸");
		return householdMember;
	}
	//母亲
	private HouseholdMember packageMother(CreateFamilyCondition condition) {
		HouseholdMember householdMember = new HouseholdMember();
		householdMember.setHouseholdId(condition.getHouseholdId());
		householdMember.setHouseholdName(condition.getHouseholdName());
		householdMember.setGender(2); //1 男 2 女
		householdMember.setFatherId(0);
		householdMember.setMotherId(0);
		householdMember.setMainFlag(0);//1 主干 0 非
		householdMember.setMarried(1);//1 已婚 0 未婚
		householdMember.setMemberNickname("妈妈");
		return householdMember;
	}
	//自己
	private HouseholdMember packageMyself(CreateFamilyCondition condition) {
		HouseholdMember householdMember = new HouseholdMember();
		householdMember.setIntroduction(condition.getIntroduction());
		householdMember.setMemberSurname(condition.getSurname());
		householdMember.setMemberName(condition.getSecname());
		householdMember.setHouseholdId(condition.getHouseholdId());
		householdMember.setHouseholdName(condition.getHouseholdName());
		householdMember.setGender(condition.getGender()); //1 男 2 女
		householdMember.setFatherId(0);
		householdMember.setMotherId(0);
		householdMember.setMainFlag(1);//1 主干 0 非
		householdMember.setMarried(condition.getMarriageFlag());//1 已婚 0 未婚
		householdMember.setMemberNickname("自己");
		householdMember.setHeadImgUrl(condition.getHeadimgurl());
		return householdMember;
	}
	//配偶
	private HouseholdMember packageSpouse(CreateFamilyCondition condition) {
		HouseholdMember householdMember = new HouseholdMember();
		householdMember.setHouseholdId(condition.getHouseholdId());
		householdMember.setHouseholdName(condition.getHouseholdName());
		if(condition.getGender()==1) {
			householdMember.setGender(2); //1 男 2 女
			householdMember.setMemberNickname("妻子");
		}else {
			householdMember.setGender(1); //1 男 2 女
			householdMember.setMemberNickname("丈夫");
		}
		householdMember.setFatherId(0);
		householdMember.setMotherId(0);
		householdMember.setMemberSurname(condition.getSpouseSurname());
		householdMember.setMemberName(condition.getSpouseSecname());
		householdMember.setMainFlag(0);//1 主干 0 非
		householdMember.setMarried(1);//1 已婚 0 未婚
		return householdMember;
	}
	//子女
	private HouseholdMember packageChild(Integer number,CreateFamilyCondition condition) {
		HouseholdMember householdMember = new HouseholdMember();
		householdMember.setHouseholdId(condition.getHouseholdId());
		householdMember.setHouseholdName(condition.getHouseholdName());
		householdMember.setGender(1); //1 男 2 女
		householdMember.setFatherId(0);
		householdMember.setMotherId(0);
		householdMember.setMainFlag(1);//1 主干 0 非
		householdMember.setMarried(0);//1 已婚 0 未婚
		switch (number) {
		case 1:
			householdMember.setMemberNickname("老大");
			break;
		case 2:
			householdMember.setMemberNickname("老二");
			break;
		case 3:
			householdMember.setMemberNickname("老三");
			break;
		case 4:
			householdMember.setMemberNickname("老四");
			break;
		case 5:
			householdMember.setMemberNickname("老五");
			break;
		case 6:
			householdMember.setMemberNickname("老六");
			break;
		case 7:
			householdMember.setMemberNickname("老七");
			break;
		default:
			break;
		}
		return householdMember;
	}
}
