package com.SIWE.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.SIWE.domain.News;
import com.SIWE.service.NewsReleaseService;
import com.opensymphony.xwork2.ActionSupport;

public class NewsReleaseAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3940408375513112667L;
	
	
	public String create(){
		
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpServletResponse res = ServletActionContext.getResponse();
		
		News news_para = getNewsbean(req,res);
		
		getNewsReleaseService().saveNews(news_para);
		
		setMsg("保存新闻成功！");
		
		return SUCCESS;
		
	}
	
	
	public String index(){
		
		setMsg("Hello,World!");
		return SUCCESS;
		
	}
	
	
	private String msg;
	
	public void setMsg(String msg){
		this.msg = msg;
	}
	
	public String getMsg(){
		return this.msg;
	}
	
	private News getNewsbean(HttpServletRequest req, HttpServletResponse res) {
		
		News news_para = new News();
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//		sdf.setLenient(false);

		news_para.setTitle(req.getParameter("title_news"));
		news_para.setContent(req.getParameter("content_news"));
		news_para.setNewsClass(req.getParameter("newsTypeId_news"));
		news_para.setReleaseDate(req.getParameter("releasedate"));
		
		return news_para;
	}




	//获取用户业务逻辑
    public NewsReleaseService getNewsReleaseService(){ 
    	return newsReleaseService; 
    }
    //设定用户业务逻辑
    public void setNewsReleaseService(NewsReleaseService newsReleaseService){ 
    	this.newsReleaseService = newsReleaseService; 
    }
    private NewsReleaseService newsReleaseService;
	

}
