package com.dlm.xpjf.bam_basemanagement.service;

import java.util.List;

import com.dlm.xpjf.pojo.AlbumImage;


public interface AlbumImageService {
	List<AlbumImage> list();
	void add(AlbumImage record);
	void update(AlbumImage record);
	void delete(int id);
	AlbumImage get(int id);
	
	//根据albumId查图片信息
	List<AlbumImage> findAlbumImageListByAlbumId(Integer albumId);
	
	//批量保存图片地址
	void addAlbumImageList(Integer albumId, List<String> imgUrlList);
}
