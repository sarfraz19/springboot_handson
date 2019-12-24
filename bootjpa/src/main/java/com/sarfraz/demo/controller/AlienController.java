package com.sarfraz.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sarfraz.demo.Alien;
import com.sarfraz.demo.dao.AlienRepo;

@Controller
public class AlienController {
	
	//it auto wires the repository when the project is initialized 
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "Alien.jsp";
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		//to save the values to the database
		repo.save(alien);
		return "Alien.jsp";
	}
	@RequestMapping("/showAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		Alien alien = repo.findById(aid).orElse(new Alien());
		mv.addObject(alien);
		return mv;
	}
}
