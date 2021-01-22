package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//We don't need to extend HTTPServlet if we specify @Controller
public class LoginController {
	
	@RequestMapping(value = "/login")
	//@ResponseBody
	public String sayHello() {
		return "index";
	}

}
