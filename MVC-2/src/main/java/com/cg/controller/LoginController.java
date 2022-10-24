package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//service,repository,component

@Controller
public class LoginController {
	
	@RequestMapping(value ="/hello")
	@ResponseBody
	public String hello()
	{
		return "Hello world!!!";
	}

}
