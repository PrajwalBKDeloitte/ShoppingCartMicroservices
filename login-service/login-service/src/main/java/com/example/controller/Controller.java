package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.UserLogin;
import com.example.service.LoginService;
import com.example.service.LoginServiceImpl;

@RestController
public class Controller {
	
	@Autowired
	private LoginServiceImpl loginService;
	
	@GetMapping("/l")
	public String g() {
		return "MAAL";
	}
	
	@PostMapping("/login")
	public boolean login(@RequestBody UserLogin userLogin) {
		
		//return true;
		return loginService.authenticate(userLogin);
		
	}
}
