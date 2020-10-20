package com.dlm.xpjf.bam_basemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlm.xpjf.bam_basemanagement.service.ArticleInfoService;
import com.dlm.xpjf.mapper.ArticleInfoMapper;
import com.dlm.xpjf.pojo.ArticleInfo;
import com.dlm.xpjf.pojo.ArticleInfoExample;

@Service
public class ArticleInfoServiceImpl implements ArticleInfoService {
	@Autowired
	ArticleInfoMapper mapper;

	@Override
	public List<ArticleInfo> list() {
		ArticleInfoExample example = new ArticleInfoExample();
		example.setOrderByClause("id desc");
		return mapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public void add(ArticleInfo record) {
		mapper.insertSelective(record);
	}

	@Override
	public void delete(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(ArticleInfo record) {
		mapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public ArticleInfo get(int id) {
		return mapper.selectByPrimaryKey(id);
	}
}
