package org.cap.controller;

import org.cap.entities.AppUser;
import org.cap.entities.Employee;
import org.cap.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HelloController {

	private IUserService service;

	public IUserService getService() {
		return service;
	}
	
	private AppUser appUser;

	public AppUser getAppUser() {
		return appUser;
	}

	@Autowired
	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	@Autowired
	public void setService(IUserService service) {
		this.service = service;
	}

	@GetMapping("/userinput")
	public ModelAndView userInput() {
		System.out.println("inside userinput");
		return new ModelAndView("userinput");
	}

	@GetMapping("/logincheck")
	public RedirectView logincheck(@RequestParam("id") int id, @RequestParam("password") String password) {
		// appUser.setId(id);
	
		boolean correct=service.credentialsCorrect(id, password);
		if(correct) {
			appUser=service.findById(id);
		    return new RedirectView("/home");
	}
	else {
		return new RedirectView("/userinput");
	}

}
	
	@GetMapping("/home")
	public Object home() {
		if(appUser.getId()==0) {
			return new RedirectView("/userinput");
		}
		ModelAndView mv=new ModelAndView("home","user",appUser);
		return mv;
	}
}
