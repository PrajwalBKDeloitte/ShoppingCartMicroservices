package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.UserLogin;
import com.example.repo.LoginRepo;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginRepo loginRepo;
	
	@Override
	public boolean authenticate(UserLogin userLogin) {
		
		try {
			Long id = loginRepo.login(userLogin.getName(), userLogin.getPassword()).getId();
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	
	
	
}
