package com.springcloud.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/findUser")
	@ResponseBody
	public User findUser(String phone) {
		return userService.findUserByPhone(phone);
	}
	
	@RequestMapping("/addUser")
	@ResponseBody
	public String addUser() {
		User user = new User();
		user.setName("张磊");
		user.setPassword("3369");
		user.setPhone("188");
		userService.saveUser(user);
		return "OK";
	}
}
