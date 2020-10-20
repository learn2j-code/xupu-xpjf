package com.dlm.xpjf.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.xpjf.bam_basemanagement.service.AlbumImageService;
import com.dlm.xpjf.bam_basemanagement.service.HouseholdAlbumService;
import com.dlm.xpjf.bam_basemanagement.vo.HouseholdAlbumExtends;
import com.dlm.xpjf.mapper.HouseholdAlbumMapper;
import com.dlm.xpjf.pojo.AlbumImage;
import com.dlm.xpjf.pojo.HouseholdAlbum;
import com.dlm.xpjf.pojo.HouseholdAlbumExample;

@Service
public class HouseholdAlbumServiceImpl implements HouseholdAlbumService {
	@Autowired
	HouseholdAlbumMapper mapper;
	@Autowired
	AlbumImageService albumImageService;

	@Override
	public List<HouseholdAlbum> list() {
		HouseholdAlbumExample example = new HouseholdAlbumExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(HouseholdAlbum record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(HouseholdAlbum record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public HouseholdAlbumExtends get(int id) {
		HouseholdAlbum householdAlbum = mapper.selectByPrimaryKey(id);
		HouseholdAlbumExtends householdAlbumExtends = new HouseholdAlbumExtends();
		BeanUtils.copyProperties(householdAlbum, householdAlbumExtends);
		List<AlbumImage> albumImageList = albumImageService.findAlbumImageListByAlbumId(householdAlbum.getId());
		householdAlbumExtends.setAlbumImageList(albumImageList);
		return householdAlbumExtends;
	}

	@Override
	public List<HouseholdAlbum> findHouseholdAlbumListByHouseholdId(Integer householdId) {
		HouseholdAlbumExample example = new HouseholdAlbumExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andHouseholdIdEqualTo(householdId);
		return mapper.selectByExample(example);
	}

	
}
