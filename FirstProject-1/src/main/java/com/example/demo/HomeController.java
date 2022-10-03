package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping(value = "home", method = RequestMethod.GET)
	@ResponseBody
	public  ModelAndView home(@RequestParam("name") String myName) {
		
		ModelAndView  mv = new ModelAndView();
		mv.addObject("name",myName);
		System.out.println("name = "+myName);
		mv.setViewName("home");
		return mv;
	}
	//adding object
	
	@RequestMapping(value = "home1", method = RequestMethod.GET)
	@ResponseBody
	public  ModelAndView home1(Alien al) {
		
		ModelAndView  mv = new ModelAndView();
		mv.addObject("obj",al);
		System.out.println("Object data = "+al);
		mv.setViewName("home");
		return mv;
	}
	
	
}
