package com.SIWE.service.impl;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.SIWE.dao.RegistDAO;
import com.SIWE.domain.User;
import com.SIWE.service.RegistService;

@Transactional
public class RegistServiceImpl implements RegistService {
	
	
	private RegistDAO registDAO;
	
	public void setRegistDAO(RegistDAO registDAO){
		this.registDAO = registDAO;
	}
	
	public RegistDAO getRegistDAO(){
		return this.registDAO;
	}

	@Transactional(readOnly=false,propagation = Propagation.REQUIRED,rollbackFor=Throwable.class)
	@Override
	public void Regist_user(User user_para) {
		
		 getRegistDAO().create(user_para);
		
	}

	public User checkUser(String username) {
		User exiting_user =null;
		exiting_user = getRegistDAO().query(username);
		return exiting_user;
	}

}
