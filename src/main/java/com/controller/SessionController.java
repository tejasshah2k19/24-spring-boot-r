package com.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.UserBean;

@RestController
public class SessionController {

	@PostMapping("/signup")
	public UserBean signup(@RequestBody UserBean userBean) {
		// fn em pw gender
		
		//db insert 
		
		return userBean;// json
	}
}
