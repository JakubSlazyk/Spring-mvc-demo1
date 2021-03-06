package com.github.jakubslazyk.springdemo1.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}
	
	//need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}
	//new controller to read data form data and add to model
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest request,Model model){
		//read the request parameter from form
		String theName = request.getParameter("studentName");
		//convert to UPPER case
		theName=theName.toUpperCase();
		//create message
		String result = "Hi! "+theName;
		//add message to model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String theName
			,Model model){

		//convert to UPPER case
		theName=theName.toUpperCase();
		//create message
		String result = "Hey my friend from V.3! "+theName;
		//add message to model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
}
