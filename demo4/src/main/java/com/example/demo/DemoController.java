package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	@RequestMapping(value="/hi")
	public String myMethod(){
		//ModelAndView model=new ModelAndView("index");
		return "index.html";
		
	}
	
	@RequestMapping(value="/hii")
	public String myMethod1(){
	//	ModelAndView model=new ModelAndView("kiran");
		return "kiran";
		
	}
}
