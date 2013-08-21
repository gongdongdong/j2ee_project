package com.SIWE.dao.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.orm.jpa.support.JpaDaoSupport;

import com.SIWE.dao.NewsReadDAO;
import com.SIWE.domain.News;

public class NewsReadDAOImpl extends JpaDaoSupport implements NewsReadDAO {

	String hql = "from News a  order by a.releaseDate desc";

	//新增试卷
	public void create(News news) {
		this.getJpaTemplate().persist(news);
	}
	//修改试卷
    public void update(News news) {
    	this.getJpaTemplate().merge(news);
	}
    //删除试卷
    public void delete(News news) {
    	this.getJpaTemplate().remove(this.getJpaTemplate().merge(news));
	}
    //根据id获取试卷信息
	public News query(int id) {
		News news = this.getJpaTemplate().find(News.class, id);
    	return news;
	}
    //获取所有试卷的信息
    @SuppressWarnings("unchecked")
	public List<News> queryList() {
    	List<News> list = new ArrayList<News>();
		list = this.getJpaTemplate().find(hql);
		return list;
	}




}
