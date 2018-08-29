package com.springcloud.mybatis;

import java.io.Serializable;

public class User implements Serializable{
	private Integer id;
	private String name;
	private String password;
	private String phone;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User( String name, String password, String phone) {
		this.name = name;
		this.password = password;
		this.phone = phone;
	}
	
	
	
	public User() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
