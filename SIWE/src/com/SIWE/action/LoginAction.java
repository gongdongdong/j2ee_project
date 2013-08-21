package com.SIWE.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.SIWE.domain.News;
import com.SIWE.domain.User;
import com.SIWE.service.LoginService;
import com.SIWE.service.NewsReadService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2670123065104768193L;
	
	public String execute() throws Exception {
		

		HttpServletRequest req = ServletActionContext.getRequest();
      //获取已有的新闻信息
		List<News> listNews = getNewsReadService().queryList();
		//将已有的新闻信息传递给页面
		req.setAttribute("listNews", listNews);
		req.setAttribute("msg", "Hello,World!");

	
		return super.execute();
	}
	

	public String checkin(){
		
		
		
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpServletResponse res = ServletActionContext.getResponse();
		
	    //获取已有的新闻信息
		List<News> listNews = getNewsReadService().queryList();

		User user_para = getUserbean(req, res);
		User user = getLoginService().LoginCheck(user_para.getUsername());
		//将已有的用户信息传递给页面
		


	
		if(user != null && user_para.getPassword().equals(user.getPassword()))
		{
			try {
				req.getSession().setAttribute("user", user);
				req.getSession().setAttribute("username", user.getUsername());
				req.getSession().setAttribute("password", user.getPassword());
				req.getSession().setAttribute("siwegroup", user.getSiwegroup());
				req.setAttribute("listNews", listNews);
				req.setAttribute("msgtoshow", "登录成功");
			} catch (Exception e) {
				req.getSession().setAttribute("user", null);
				req.getSession().setAttribute("username", null);
				req.getSession().setAttribute("password", null);
				req.setAttribute("listNews", listNews);
				req.setAttribute("msgtoshow", "登录失败");
				e.printStackTrace();
			}
		}
		else
		{
			req.getSession().setAttribute("user", null);
			req.getSession().setAttribute("username", null);
			req.getSession().setAttribute("password", null);
			req.setAttribute("listNews", listNews);
			req.setAttribute("msgtoshow", "登录失败");
		}
		
		
		return SUCCESS; 
		
	}
	
	public String checkout(){
		
		HttpServletRequest req = ServletActionContext.getRequest();		
	     //获取已有的新闻信息
		List<News> listNews = getNewsReadService().queryList();
		//将已有的新闻信息传递给页面
		req.setAttribute("listNews", listNews);
		req.getSession().invalidate();
		req.setAttribute("msgtoshow", "登出成功");
		return SUCCESS; 
		
	}
	
	

	
	


	//获取用户登录业务逻辑
    public LoginService getLoginService(){ 
    	return loginService; 
    }
    //设定用户登录业务逻辑
    public void setLoginService(LoginService loginService){ 
    	this.loginService = loginService; 
    }
    private LoginService loginService;
    
    
    //新闻阅读业务逻辑
	public NewsReadService getNewsReadService() {		
		return newsReadService;
	}	
	public void setNewsReadService(NewsReadService newsReadService){
		this.newsReadService = newsReadService;
	}
	private NewsReadService newsReadService;
 
	
	//页面信息设置
	@SuppressWarnings("unused")
	private void setMessage(String message) {
		this.message = message;		
	}
	public String getMessage(){
		return message;
	}
	private String message; 

	//参数获取方法
	private User getUserbean(HttpServletRequest req, HttpServletResponse res) {
		User user = new User();		
		try {
			user.setUsername(req.getParameter("username"));
			user.setPassword(req.getParameter("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

}
