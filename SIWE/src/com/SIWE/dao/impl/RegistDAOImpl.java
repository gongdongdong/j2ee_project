package com.SIWE.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.jpa.support.JpaDaoSupport;

import com.SIWE.dao.RegistDAO;
import com.SIWE.domain.User;

public class RegistDAOImpl extends JpaDaoSupport implements RegistDAO {

	
    String hql = "from User a where a.username = ?"; 
    
	public void create(User user_para) {
		
		this.getJpaTemplate().persist(user_para);
	
	}
	
	@SuppressWarnings("unchecked")
	public User query(String username) {
		User exit_user = null;
		
		List<User> list = new ArrayList<User>();
		
		list = this.getJpaTemplate().find(hql, username);
		
		try {
			list = this.getJpaTemplate().find(hql, username);
		} catch (DataAccessException e) {
			list = null;
			e.printStackTrace();
		}
		
		if (list != null && list.size() == 1 ) {
			exit_user = list.get(0);
    	}
		return exit_user;
	
	}

}
