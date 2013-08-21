package com.SIWE.service.impl;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.SIWE.dao.LoginDAO;
import com.SIWE.domain.User;
import com.SIWE.service.LoginService;

@Transactional
public class LoginServiceImpl implements LoginService{

	@Transactional(readOnly=false,propagation = Propagation.REQUIRED,rollbackFor=Throwable.class)
	public User LoginCheck(String username) {
		User result = null;
    	result = this.getLoginDAO().query(username);
		return result;
	}


    public LoginDAO getLoginDAO(){ 
    	return loginDAO; 
    }
    public void setLoginDAO(LoginDAO loginDAO){ 
    	this.loginDAO = loginDAO; 
    }

    private LoginDAO loginDAO;
}
