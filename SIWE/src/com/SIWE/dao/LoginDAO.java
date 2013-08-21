package com.SIWE.dao;

import com.SIWE.domain.User;

public interface LoginDAO {
	User query(String username);

}
