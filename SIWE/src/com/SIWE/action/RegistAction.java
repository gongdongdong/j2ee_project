package com.SIWE.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.SIWE.domain.User;
import com.SIWE.service.RegistService;
import com.opensymphony.xwork2.ActionSupport;

public class RegistAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3640784794366900473L;

	public String regist(){
		
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpServletResponse res = ServletActionContext.getResponse();
		
		User user_para = getUserbean(req, res);
		
		if(getRegistService().checkUser(user_para.getUsername()) != null)
		{
			setMsg("用户已经存在！");
		}
		else
		{
			getRegistService().Regist_user(user_para);
			setMsg("注册成功！");
			req.getSession().setAttribute("username",user_para.getUsername());
			req.getSession().setAttribute("password",user_para.getPassword());
			req.getSession().setAttribute("siwegroup", "4");
			
			
//			req.setAttribute("username",user_para.getUsername());
//			req.setAttribute("password",user_para.getPassword());
//			req.setAttribute("siwegroup", "4");
//			
			try {
				res.sendRedirect("/SIWE/jsp.action");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

		
		return SUCCESS;
		
	}
	private User getUserbean(HttpServletRequest req, HttpServletResponse res) {
		User user = new User();
		
		try {
			user.setUsername(req.getParameter("username"));
			user.setPassword(req.getParameter("password"));
			user.setUserEmail(req.getParameter("userEmail"));
			user.setUserFrom(req.getParameter("userFrom"));
			user.setUserOICQ(req.getParameter("userOICQ"));
			user.setUserPhone(req.getParameter("userPhone"));
			user.setUserSex(req.getParameter("userSex"));
			user.setSiwegroup("4");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
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

	
	
	
	private RegistService registService;
	
	public void setRegistService(RegistService registService){
		this.registService = registService;
	}
	
	public RegistService getRegistService(){
		return this.registService;
	}

}
