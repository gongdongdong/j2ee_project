package com.SIWE.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.SIWE.dao.NewsReadDAO;
import com.SIWE.domain.News;
import com.SIWE.service.NewsReadService;

@Transactional(readOnly=false,propagation = Propagation.REQUIRED,rollbackFor=Throwable.class)
public class NewsReadServiceImpl implements NewsReadService {
   
	
	//查询所有的试卷信息
	@Override
	public List<News> queryList() {

	    List<News> list = new ArrayList<News>();
		list = this.getNewsReadDAO().queryList();
		return list;

	}
	

	public News getNewsToRead(int newsId) {
		News newsToRead = null;
		newsToRead = getNewsReadDAO().query(newsId);
		
		return newsToRead;
	}
	
	private NewsReadDAO newsReadDAO;
	
	public void setNewsReadDAO(NewsReadDAO newsReadDAO){
		this.newsReadDAO = newsReadDAO;
	}
	
	public NewsReadDAO getNewsReadDAO(){
		return this.newsReadDAO;
	}


	

}
