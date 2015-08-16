package com.beans;

import org.springframework.stereotype.Component;

@Component
public class LoginBean {
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	int customerId;
	String password;
	
}
