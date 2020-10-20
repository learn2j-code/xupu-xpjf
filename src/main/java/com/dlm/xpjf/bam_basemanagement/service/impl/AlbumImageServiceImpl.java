package com.dlm.xpjf.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.xpjf.bam_basemanagement.service.AlbumImageService;
import com.dlm.xpjf.bam_basemanagement.service.HouseholdAlbumService;
import com.dlm.xpjf.mapper.AlbumImageMapper;
import com.dlm.xpjf.mapper.HouseholdAlbumMapper;
import com.dlm.xpjf.pojo.AlbumImage;
import com.dlm.xpjf.pojo.AlbumImageExample;
import com.dlm.xpjf.pojo.HouseholdAlbum;
import com.dlm.xpjf.pojo.HouseholdAlbumExample;

@Service
public class AlbumImageServiceImpl implements AlbumImageService {
	@Autowired
	AlbumImageMapper mapper;

	@Override
	public List<AlbumImage> list() {
		AlbumImageExample example = new AlbumImageExample();
		example.setOrderByClause("id asc");
		return mapper.selectByExample(example);
	}

	@Override
	public void add(AlbumImage record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(AlbumImage record) {
		mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public AlbumImage get(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<AlbumImage> findAlbumImageListByAlbumId(Integer albumId) {
		AlbumImageExample example = new AlbumImageExample();
		example.setOrderByClause("id asc");
		example.createCriteria().andAlbumIdEqualTo(albumId);
		return mapper.selectByExample(example);
	}

	@Override
	public void addAlbumImageList(Integer albumId, List<String> imgUrlList) {
		for(String imgUrl:imgUrlList) {
			AlbumImage albumImage = new AlbumImage();
			albumImage.setAlbumId(albumId);
			albumImage.setImageUrl(imgUrl);
			add(albumImage);
		}
	}

	
}
