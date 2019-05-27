package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/controller")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET,value = "/page")
	public String getPage()
	{
		return "Homepage";
	}
}
