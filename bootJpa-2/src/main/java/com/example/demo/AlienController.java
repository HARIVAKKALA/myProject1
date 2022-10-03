package com.example.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@PostMapping(path="/alien",consumes= {"application/json"})
	public Alien addAlien(Alien alien) {
		
	   repo.save(alien); 
		return  alien;
		
	}
	
	@GetMapping("Aliens")
	public List<Alien> getAliens(){
		
		return repo.findAll();
	}

	@GetMapping(path = "/alien/{aid}")
	public Optional<Alien> getAlien(@PathVariable int aid) {
		return repo.findById(aid);
	}
	
	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable int aid) {
		
		Alien a = repo.getOne(aid);
		repo.delete(a);
		return "deleted";
		
		
	}
	
	@PutMapping(path="/alien",consumes= {"application/json"})
	public Alien updateAlien(Alien alien) {
		
		repo.save(alien); 
		return  alien;
		
	}
	
	
}
