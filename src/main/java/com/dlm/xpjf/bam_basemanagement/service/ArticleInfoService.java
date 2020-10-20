package com.dlm.xpjf.bam_basemanagement.service;

import java.util.List;

import com.dlm.xpjf.pojo.ArticleInfo;


public interface ArticleInfoService {
	List<ArticleInfo> list();
	void add(ArticleInfo record);
	void update(ArticleInfo record);
	void delete(int id);
	ArticleInfo get(int id);
}
