package com.springmvc;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean isValidUser(String name,String password) {
		return name.equals("Siva")&&password.equals("password");
	}

}
