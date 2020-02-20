package com.wanghao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.wanghao.entity.Article;
import com.wanghao.entity.Condition;
import com.wanghao.service.ArticleService;

@Controller
public class ArticleController {

	@Autowired
	ArticleService articleService;
	
	@RequestMapping("list")
	public String getList(@RequestParam(defaultValue="1")int page,Condition con,Model m) {
		System.err.println(con);
		PageInfo<Article> pageInfo = articleService.getList(page,con);
		m.addAttribute("pageInfo", pageInfo);
		return "list";
	}
}
