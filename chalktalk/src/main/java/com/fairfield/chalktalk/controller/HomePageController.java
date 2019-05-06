package com.fairfield.chalktalk.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomePageController {
	
	/*@Resource(name="authenticationManager")
    private AuthenticationManager authManager;*/
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		return "home";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {
		if (error != null) {
			System.out.println("error Occured during login");
			return "loginErrorPage";
		}
		
		return "loginpage";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/mentorapplication", method = RequestMethod.GET)
	public String mentorApplicationPage() {
		
		return "mentorapplication";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/startupapplication", method = RequestMethod.GET)
	public String startupApplicationPage() {
		
		return "startupapplication";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping(value = "/adminpage", method = RequestMethod.GET)
	public String adminPage() {
		
		return "adminpage";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@PreAuthorize("hasAnyRole('MENTOR')")
	@RequestMapping(value = "/mentorpage", method = RequestMethod.GET)
	public String mentorPage() {
		
		return "mentorpage";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@PreAuthorize("hasAnyRole('MENTEE')")
	@RequestMapping(value = "/menteepage", method = RequestMethod.GET)
	public String menteePage() {
		
		return "menteepage";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public String accessDeniedPage() {
		
		return "403";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String menuPage() {
		
		return "menu";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/displaymentorprofiles", method = RequestMethod.GET)
	public String displayMentorProfiles() {
		
		return "displaymentorprofiles";
	}
}
