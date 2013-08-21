package com.SIWE.dao;

import com.SIWE.domain.User;

public interface RegistDAO {

	public void create(User user_para);
	
	public User query(String username);

}
