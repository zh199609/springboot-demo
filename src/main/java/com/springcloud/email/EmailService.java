package com.springcloud.email;

import java.io.File;
import java.util.Arrays;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	static {
		System.setProperty("mail.mime.splitlongparameters","false");
	}
	
	@Autowired
	private EmailConfig emailConfig;
	
	@Autowired
	private JavaMailSender mailSender;
	//发送简单的邮件
	public void sendSimpleMail(String sendTo,String title,String content) {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setFrom(emailConfig.getEmailFrom());
		simpleMailMessage.setTo(sendTo);
		simpleMailMessage.setSubject(title);
		simpleMailMessage.setText(content);
		mailSender.send(simpleMailMessage);
	}
	
	
	//发送带附件的邮件
	public void sednAttachmentMail(String sendTo,String title,String content,File file) {
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		try {
			MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true,"UTF-8");
			mimeMessageHelper.setFrom(emailConfig.getEmailFrom());
			String[] split = sendTo.split(";");	
			mimeMessageHelper.setTo(split);
			mimeMessageHelper.setSubject(title);
			mimeMessageHelper.setText(content);
			FileSystemResource fileSystemResource = new FileSystemResource(file);
			String fileName = file.getName();
			System.out.println("fileName==="+fileName);
			mimeMessageHelper.addAttachment(fileName, fileSystemResource);//附件的名字  带后缀
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		mailSender.send(mimeMessage);
	}
	
	
}
