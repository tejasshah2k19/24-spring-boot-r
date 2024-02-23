package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.UserBean;
import com.dao.UserDao;

@RestController
public class SessionController {

	
	@Autowired
	UserDao userDao;
	
	@PostMapping("/signup")
	public UserBean signup(@RequestBody UserBean userBean) {
		// fn em pw gender
		
		//db insert 
		userDao.addUser(userBean);
		return userBean;// json
	}
}
