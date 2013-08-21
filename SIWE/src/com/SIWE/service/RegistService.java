package com.SIWE.service;

import com.SIWE.domain.User;

public interface RegistService {

	public void Regist_user(User user_para);

	public User checkUser(String username);

}
