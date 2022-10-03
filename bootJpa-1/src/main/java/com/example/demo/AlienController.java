package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
/*This controller class by using crudrepository interfaces methods*/
@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
//	@RequestMapping("/")
//	public String home() {
//		System.out.println("home page");
//		return "home.jsp";
	//}
	
	@RequestMapping("/addAlien")
	public ModelAndView addAlien(Alien al) {
		
		 ModelAndView mv = new  ModelAndView("home.jsp");
		 repo.save(al);
		 return mv;
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		
		ModelAndView  mv = new ModelAndView("show.jsp");
		Alien al = repo.findById(aid).orElse(new Alien());
		mv.addObject(al);
		return mv;		
	}
	
	@RequestMapping("/alines")
	@ResponseBody
	public String getAliens() {
		
		return repo.findAll().toString();
	}
	
	@RequestMapping("/byid/{aid}")
	@ResponseBody
	public String getbyid(@PathVariable int aid) {
		
		return repo.findAll().toString();
	}
	
	
}
