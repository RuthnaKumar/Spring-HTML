package com.rk.html;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class htmlcontroller {
	@RequestMapping("/login")
	//@GetMapping("/login ")
	public String html()
	{  
		return "index";
	}

	@RequestMapping("/button")
	public String button()
	{  
		return "button";
	}

	@RequestMapping("/textbox")
	public String textbox()
	{ 
		return "textbox";
	}
	
	@RequestMapping("/signup")
	public String signup()
	{  
		return "signup";
	}
	
	@RequestMapping("/register")
	public String register()
	{  
		return "register";
	}
}
