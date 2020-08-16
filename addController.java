package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class addController 
{
	@RequestMapping("add")
	public void adding()
	{
		System.out.println("welcome");
	}

}
