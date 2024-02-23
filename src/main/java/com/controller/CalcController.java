package com.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.CalcBean;

@RestController
public class CalcController {

	@PostMapping("/demo")
	public HashMap demo() {

		// json -> key:value
		HashMap<String, Object> hm = new HashMap<>();
		hm.put("msg", "Good Morning");
		hm.put("code", 200);
		hm.put("success", true);

		return hm;
	}

	@PostMapping("/add")
	public HashMap<String, Object> add(@RequestBody CalcBean calc) {
		HashMap<String, Object> hm = new HashMap<>();
		Integer ans = calc.getX() + calc.getY(); 
		
		hm.put("add",ans);
		return hm;
	}
}
