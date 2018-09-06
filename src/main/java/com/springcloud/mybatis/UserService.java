package com.springcloud.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	
	//@Cacheable(value="myUser")
	public User findUserByPhone(String phone) {
		System.out.println("从数据库中取数据。");
		return userMapper.findUserByPhone(phone);
	};

	public int saveUser(User user) {
		return userMapper.saveUser(user);
	};
}
