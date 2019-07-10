package com.wordpython.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.wordpython.dao.UserDao;
import com.wordpython.po.User;
import com.wordpython.service.UserService;
/*
 * 建立service层的目的是，测试类通过service层调用dao,而不是直接调用dao，
 * 因为service可以控制事务回滚，dao不能
 */
@Service
@Transactional//添加事务，springboot就不用在xml配置了
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Override
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}
	@Override
	public int save(User user) {
		int total = userDao.save(user);
//		int i=10/0;
		return total;
	}

}
