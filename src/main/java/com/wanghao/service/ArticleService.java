package com.wanghao.service;

import com.github.pagehelper.PageInfo;
import com.wanghao.entity.Article;
import com.wanghao.entity.Condition;

public interface ArticleService {

	PageInfo<Article> getList(int page, Condition con);

}
