package com.dlm.xpjf.bam_basemanagement.vo;


import java.util.List;

import com.dlm.xpjf.pojo.AlbumImage;
import com.dlm.xpjf.pojo.ArticleInfo;
import com.dlm.xpjf.pojo.HouseholdAlbum;
import com.dlm.xpjf.pojo.HouseholdInfo;
import com.dlm.xpjf.pojo.HouseholdMember;
import com.dlm.xpjf.pojo.UserInfo;
import com.dlm.xpjf.util.Page;


public class RequestEntity {
	private UserInfo userInfo;
	private HouseholdMember householdMember;
	private HouseholdInfo householdInfo;
	private HouseholdAlbum householdAlbum;
	private AlbumImage albumImage;
	private List<String> imgUrlList;
	private CreateFamilyCondition createFamilyCondition;
	private ArticleInfo articleInfo;
	private String openid;
	private Integer id;
	private Integer headId;
	private Integer num;
	private Integer albumId;
	
	private Page page;
	
	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public HouseholdMember getHouseholdMember() {
		return householdMember;
	}

	public void setHouseholdMember(HouseholdMember householdMember) {
		this.householdMember = householdMember;
	}

	public HouseholdInfo getHouseholdInfo() {
		return householdInfo;
	}

	public void setHouseholdInfo(HouseholdInfo householdInfo) {
		this.householdInfo = householdInfo;
	}

	public ArticleInfo getArticleInfo() {
		return articleInfo;
	}

	public void setArticleInfo(ArticleInfo articleInfo) {
		this.articleInfo = articleInfo;
	}

	public CreateFamilyCondition getCreateFamilyCondition() {
		return createFamilyCondition;
	}

	public void setCreateFamilyCondition(CreateFamilyCondition createFamilyCondition) {
		this.createFamilyCondition = createFamilyCondition;
	}

	public Integer getHeadId() {
		return headId;
	}

	public void setHeadId(Integer headId) {
		this.headId = headId;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getOpenid() {
		return openid;
	}

	public HouseholdAlbum getHouseholdAlbum() {
		return householdAlbum;
	}

	public void setHouseholdAlbum(HouseholdAlbum householdAlbum) {
		this.householdAlbum = householdAlbum;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public AlbumImage getAlbumImage() {
		return albumImage;
	}

	public void setAlbumImage(AlbumImage albumImage) {
		this.albumImage = albumImage;
	}

	public List<String> getImgUrlList() {
		return imgUrlList;
	}

	public void setImgUrlList(List<String> imgUrlList) {
		this.imgUrlList = imgUrlList;
	}

	public Integer getAlbumId() {
		return albumId;
	}

	public void setAlbumId(Integer albumId) {
		this.albumId = albumId;
	}

}
