package com.wanghao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wanghao.dao.ArticleMapper;
import com.wanghao.entity.Article;
import com.wanghao.entity.Condition;
import com.wanghao.service.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleMapper articleMapper;

	@Override
	public PageInfo<Article> getList(int page, Condition con) {

		PageHelper.startPage(page, 10);
		
		return new PageInfo<Article>(articleMapper.getList(con));
	}
	
}
