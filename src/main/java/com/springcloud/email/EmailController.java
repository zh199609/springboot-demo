package com.springcloud.email;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	@Autowired
	private EmailService emailService;
	
	
	@RequestMapping("/simple")
	public String sendSimpleMail() {
		//System.out.println("开始发送");
		emailService.sendSimpleMail("15824349156@163.com", "你好", "三亚");
		return "SUCCESS";
	}
	
	@RequestMapping("/sendAttachmentMail")
	public String sendAttachmentMail() {
		//System.out.println("开始发送");
		File file = new File("C:\\Users\\zhanglei\\Desktop\\2018年08月14日钢联数据用户登录和注册统计.txt");
		System.out.println(file.getName());
		emailService.sednAttachmentMail("1120123073@qq.com;15824349156@163.com", "你好", "三亚",file);
		return "SUCCESS";
	}
	
}
