package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//service,repository,component

import com.cg.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService service;
	
	@RequestMapping(value ="/hello",method = RequestMethod.GET)
	public String hello()
	{
		return "Login";
	}
	
	@RequestMapping(value ="/add",method = RequestMethod.GET)
	public String add()
	{
		return "Add";
	}
	
	@RequestMapping(value ="/delete",method = RequestMethod.GET)
	public String delete()
	{
		return "Delete";
	}
	
	@RequestMapping(value ="/hello",method = RequestMethod.POST)
	public String hii(@RequestParam String user,ModelMap model,@RequestParam String pass)
	{
		if(service.validate(user, pass)) {
		model.put("user",user);
		model.put("pass",pass);
		return "welcome";
		}
		else
		{
			return "Login";
		}
	}

}
