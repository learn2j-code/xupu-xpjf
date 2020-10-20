package com.dlm.xpjf.bam_basemanagement.service;

import java.util.List;

import com.dlm.xpjf.bam_basemanagement.vo.HouseholdAlbumExtends;
import com.dlm.xpjf.pojo.HouseholdAlbum;


public interface HouseholdAlbumService {
	List<HouseholdAlbum> list();
	void add(HouseholdAlbum record);
	void update(HouseholdAlbum record);
	void delete(int id);
	HouseholdAlbumExtends get(int id);
	
	//根据householdId查家庭相册信息
	List<HouseholdAlbum> findHouseholdAlbumListByHouseholdId(Integer householdId);
}
