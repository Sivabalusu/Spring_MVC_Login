package com.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//We don't need to extend HTTPServlet if we specify @Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	//@ResponseBody
	public String showLoginPage() {
		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	//@ResponseBody
	public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password) {
		
		boolean validUser=loginService.isValidUser(name, password);
		if(validUser) {
			model.put("name", name);
			model.put("password", password);
			return "welcome";
		}
		else {
			model.put("errMessage", "InvalidCredentials");
			return "index";
		}
	}
	

}
