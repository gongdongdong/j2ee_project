package com.SIWE.service.impl;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.SIWE.dao.NewsReleaseDAO;
import com.SIWE.domain.News;
import com.SIWE.service.NewsReleaseService;

@Transactional
public class NewsReleaseServiceImpl implements NewsReleaseService {
	

	   public NewsReleaseDAO getNewsReleaseDAO(){ 
	    	return newsReleaseDAO; 
	    }
	    public void setNewsReleaseDAO(NewsReleaseDAO newsReleaseDAO){ 
	    	this.newsReleaseDAO = newsReleaseDAO; 
	    }

	    private NewsReleaseDAO newsReleaseDAO;

		@Transactional(readOnly=false,propagation = Propagation.REQUIRED,rollbackFor=Throwable.class)
		public void saveNews(News news_para) {
			getNewsReleaseDAO().saveNews(news_para);
		}

}
