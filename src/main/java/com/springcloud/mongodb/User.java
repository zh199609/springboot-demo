package com.springcloud.mongodb;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="UserIdxDownloadLog")
public class User {
	private Integer UserId;
	private String Action;
	
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action = action;
	}
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", Action=" + Action + "]";
	}
	
	

	

	
}
