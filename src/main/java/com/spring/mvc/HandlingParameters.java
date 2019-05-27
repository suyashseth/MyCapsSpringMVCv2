package com.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/param")
public class HandlingParameters {

	@RequestMapping(value = "/q",method = RequestMethod.GET)
	@ResponseBody
	public String getName(@RequestParam("fname")String name,
			@RequestParam("lname")String lastname
			)
	{
		return name+" "+lastname;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String getPage()
	{
		return "Register";
	}
	
	@RequestMapping(value = "/getdata",method = RequestMethod.POST)
	public String getData(
			@RequestParam("id")int id,
			@RequestParam("name")String name,
			@RequestParam("pass")String pass,
			@RequestParam("mail")String mail,
			Model model
			)
	{
		model.addAttribute("id", id);
		model.addAttribute("name",name);
		model.addAttribute("pass",pass);
		model.addAttribute("mail", mail);
		return "PrintUser";
	}
	
	
	
	
	
	
	
}
