package com.wanghao.dao;

import java.util.List;

import com.wanghao.entity.Article;
import com.wanghao.entity.Condition;

public interface ArticleMapper {

	List<Article> getList(Condition con);

}
