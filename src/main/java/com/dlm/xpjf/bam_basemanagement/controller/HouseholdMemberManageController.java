package com.dlm.xpjf.bam_basemanagement.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlm.xpjf.bam_basemanagement.service.HouseholdInfoService;
import com.dlm.xpjf.bam_basemanagement.service.HouseholdMemberService;
import com.dlm.xpjf.bam_basemanagement.vo.HouseholdVo;
import com.dlm.xpjf.bam_basemanagement.vo.NewHouseholdMemberVo;
import com.dlm.xpjf.bam_basemanagement.vo.RequestEntity;
import com.dlm.xpjf.bam_basemanagement.vo.ResponseEntity;
import com.dlm.xpjf.constant.CommonConstant;
import com.dlm.xpjf.pojo.HouseholdInfo;
import com.dlm.xpjf.pojo.HouseholdMember;
import com.dlm.xpjf.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("householdmember")
public class HouseholdMemberManageController {
	
	@Autowired
	HouseholdMemberService service;
	
	@Autowired
	HouseholdInfoService householdInfoService;
	/**
	 * 	查询所有
	 * @return
	 */
	@RequestMapping("findAll")
	public @ResponseBody ResponseEntity findAll(){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<HouseholdMember> list = service.list();
		data.put("list", list);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	分页查询信息
	 * @return
	 */
	@RequestMapping("findByPage")
	public @ResponseBody ResponseEntity findByPage(@RequestBody RequestEntity requestEntity){
		Page page = requestEntity.getPage();
		int pageNum = (page.getStart()-1);
		if(pageNum<0){
			return null;
		}
		PageHelper.offsetPage(pageNum*page.getCount(),page.getCount());
		
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<HouseholdMember> list = service.list();
		
		int total = (int)new PageInfo<>(list).getTotal();
		page.setTotal(total);
		page.caculateLast(total);
		
		data.put("page", page);
		data.put("list", list);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询某个信息
	 * @return
	 */
	@RequestMapping("findById")
	public @ResponseBody ResponseEntity findById(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		HouseholdMember record = service.get(requestEntity.getId());
		data.put("record", record);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 *	添加
	 * @param add
	 * @return
	 */
	@RequestMapping("add")
	public @ResponseBody ResponseEntity add(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			service.addHouseholdMember(requestEntity.getHouseholdMember());
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("record", requestEntity.getHouseholdMember());
			responseEntity.setData(data);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	编辑
	 * @param update
	 * @return
	 */
	@RequestMapping("update")
	public @ResponseBody ResponseEntity update(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			service.updateHouseholdMember(requestEntity.getHouseholdMember());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	/**
	 * 	删除
	 * @param deleteById
	 * @return
	 */
	@RequestMapping("deleteById")
	public @ResponseBody ResponseEntity deleteById(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			service.delete(requestEntity.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	查询列表
	 * @return
	 */
	@RequestMapping("findHouseholdMemberListByHouseholdId")
	public @ResponseBody ResponseEntity findHouseholdMemberListByHouseholdId(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<HouseholdMember> list = service.findHouseholdMemberListByHouseholdId(requestEntity.getId());
		data.put("list", list);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	查询头节点下的成员
	 * @return
	 */
	@RequestMapping("findNewHouseholdMemberVoByHeadId")
	public @ResponseBody ResponseEntity findNewHouseholdMemberVoByHeadId(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		NewHouseholdMemberVo record = service.findNewHouseholdMemberVoByHeadId(requestEntity.getId());
		data.put("record", record);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	/**
	 * 	根据家庭id运算家庭成员的关系路由
	 * @return
	 */
	@RequestMapping("updateRelationListByHouseholdId")
	public @ResponseBody ResponseEntity updateRelationListByHouseholdId(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			service.updateRelationListByHouseholdId(requestEntity.getId());
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	根据相关信息创建整个家庭及家庭成员信息
	 * @return
	 */
	@RequestMapping("createHouseholdMemberListByCondition")
	public @ResponseBody ResponseEntity createHouseholdMemberListByCondition(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		try {
			HouseholdVo householdVo = service.createHouseholdMemberListBy(requestEntity.getCreateFamilyCondition());
			List<HouseholdMember> householdMemberList = service.findHouseholdMemberListByHouseholdId(householdVo.getHouseholdInfo().getId());
			
			//设置头节点id
			HouseholdInfo householdInfoTemp = new HouseholdInfo();
			householdInfoTemp.setId(householdVo.getHouseholdInfo().getId());
			householdInfoTemp.setHeadId(householdVo.getHouseholdInfo().getHeadId());
			householdInfoTemp.setHeadName(householdVo.getHouseholdInfo().getHeadName());
			householdInfoService.update(householdInfoTemp);
			
			householdVo.setHouseholdMemberList(householdMemberList);
			Map<String, Object> data = new HashMap<String, Object>();
			
			data.put("record", householdVo);
			responseEntity.setData(data);
		} catch (Exception e) {
			responseEntity.setSuccess(CommonConstant.RESPONSE_FAIL);
			responseEntity.setErrorMsg(e.getMessage());
		}
        return responseEntity;
	}
	
	/**
	 * 	根据头节点id和代数查询列表
	 * @return
	 */
	@RequestMapping("findHouseholdMemberListByHeadId")
	public @ResponseBody ResponseEntity findHouseholdMemberListByHeadId(@RequestBody RequestEntity requestEntity){
		ResponseEntity responseEntity = new ResponseEntity();
		Map<String, Object> data = new HashMap<String, Object>();
		
		List<HouseholdMember> list = service.findHouseholdMemberListByHeadId(requestEntity.getHeadId(),requestEntity.getNum());
		data.put("list", list);
		responseEntity.setData(data);
		return responseEntity;
	}
	
	
	
}  
