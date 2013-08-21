package com.SIWE.dao.impl;

import org.springframework.orm.jpa.support.JpaDaoSupport;

import com.SIWE.dao.NewsReleaseDAO;
import com.SIWE.domain.News;

public class NewsReleaseDAOImpl extends JpaDaoSupport implements NewsReleaseDAO {

    String hql = "from News a where a.id = ?"; 
    String hql1 = "from News a ";
	
	public void saveNews(News news_para) {
		this.getJpaTemplate().persist(news_para);
	}



}
