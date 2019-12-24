package com.sarfraz.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
//	@RequestMapping("home")
//	public String home(@RequestParam("name") String myname, HttpSession session) 
//{
		//creating session
		  //HttpSession session = req.getSession();
		
		//getting the name value from the Http
		  //String name = req.getParameter("name");
//		System.out.println("hi " + myname);
		
		//setting session value
//		session.setAttribute("name", myname);
//		return "home";
		
//	}
	
	//================//
	//after model view//
	//================//
	//when using ModelView we no need to use sessions
//	@RequestMapping("home")
//	public ModelAndView home(@RequestParam("name") String myname) 
//{

//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name",myname);
//		mv.setViewName("home");
//		System.out.println("hi " + myname);

//		return mv;
		
//	}
	
	//################//
	//now using the class object alien.java//
	//###############//
	
	@RequestMapping("home")
	public ModelAndView home(alien alien) 
{

		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home");
		//System.out.println("hi " + alien.aname);

		return mv;
		
	}
}
