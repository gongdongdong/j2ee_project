package com.SIWE.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.jpa.support.JpaDaoSupport;

import com.SIWE.dao.LoginDAO;
import com.SIWE.domain.User;


public class LoginDAOImpl extends JpaDaoSupport implements LoginDAO {

    String hql = "from User a where a.username = ?"; 
    
	@SuppressWarnings("unchecked")
	public User query(String username) {
		User loginuser = null;
		List<User> list = new ArrayList<User>();
		try {
			list = this.getJpaTemplate().find(hql, username);
		} catch (DataAccessException e) {
			list = null;
			e.printStackTrace();
		}
		
		if (list != null && list.size() == 1 ) {
			loginuser = list.get(0);
    	}
		return loginuser;
	}

}
