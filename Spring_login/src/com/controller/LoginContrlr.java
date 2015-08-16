package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beans.LoginBean;

@Controller
@RequestMapping("/log_in")
public class LoginContrlr {
	
	@Autowired
	LoginBean loginBean;

	public LoginBean getLoginBean() {
		return loginBean;
	}

	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String validate(@ModelAttribute("loginBean") LoginBean loginBean, BindingResult result)
	{		
		if(loginBean.getCustomerId()==123)
		return("success");
		else
		return("error");
	}
}
