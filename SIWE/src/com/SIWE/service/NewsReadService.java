package com.SIWE.service;

import java.util.List;

import com.SIWE.domain.News;

public interface NewsReadService {

	List<News> queryList();

	News getNewsToRead(int newsId);

}
