package com.SIWE.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.SIWE.domain.News;
import com.SIWE.service.NewsReadService;
import com.opensymphony.xwork2.ActionSupport;

public class NewsReadAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7389972662947611798L;
	@Override
	public String execute() throws Exception {
		HttpServletRequest req = ServletActionContext.getRequest();
		News newsToRead = null;
		int newsId = Integer.parseInt(req.getParameter("id"));
	
		newsToRead = getNewsReadService().getNewsToRead(newsId);
		
		req.setAttribute("newsToRead", newsToRead);
		req.setAttribute("msg", "Hello,Friend!");
		return super.execute();
	}

	
	
	
	
    //新闻阅读业务逻辑
	public NewsReadService getNewsReadService() {		
		return newsReadService;
	}	
	public void setNewsReadService(NewsReadService newsReadService){
		this.newsReadService = newsReadService;
	}
	private NewsReadService newsReadService;
	
}
