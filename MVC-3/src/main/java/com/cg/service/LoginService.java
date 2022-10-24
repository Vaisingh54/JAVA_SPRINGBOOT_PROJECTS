package com.cg.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validate(String user,String pass)
	{
		return user.equals("rincy") && pass.equals("capg");
	}

}
