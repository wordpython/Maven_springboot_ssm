package com.wordpython.dao;

import com.wordpython.po.User;
public interface UserDao {
	public User findByUsername(String name);
	public int save(User user);
}
