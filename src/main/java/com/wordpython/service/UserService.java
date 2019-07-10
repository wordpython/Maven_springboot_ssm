package com.wordpython.service;

import com.wordpython.po.User;
public interface UserService {
	public User findByUsername(String name);
	public int save(User user);
}
