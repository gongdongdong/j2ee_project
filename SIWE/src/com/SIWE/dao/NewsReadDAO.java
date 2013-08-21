package com.SIWE.dao;

import java.util.List;

import com.SIWE.domain.News;

public interface NewsReadDAO {

    public void update(News news);
	public List<News> queryList();
	public void create(News news);
    public void delete(News news);
	public News query(int id);
}
