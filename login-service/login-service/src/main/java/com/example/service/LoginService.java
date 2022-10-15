package com.example.service;

import com.example.model.UserLogin;

public interface LoginService {
	
	boolean authenticate(UserLogin userLogin);
	
}
