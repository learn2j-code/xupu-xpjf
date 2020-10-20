package com.dlm.xpjf.bam_basemanagement.vo;

import java.util.List;

import com.dlm.xpjf.pojo.AlbumImage;
import com.dlm.xpjf.pojo.HouseholdAlbum;

public class HouseholdAlbumExtends extends HouseholdAlbum{
	List<AlbumImage> albumImageList;

	public List<AlbumImage> getAlbumImageList() {
		return albumImageList;
	}

	public void setAlbumImageList(List<AlbumImage> albumImageList) {
		this.albumImageList = albumImageList;
	}
}
