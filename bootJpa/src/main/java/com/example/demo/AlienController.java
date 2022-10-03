package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.AlienRepo;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("home page");
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien al) {
		
		repo.save(al);
		return "home.jsp";
	}

}
