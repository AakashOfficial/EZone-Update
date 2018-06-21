package com.tyagi.project.OnlineShopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {

	@RequestMapping("/AdminHome")
	public String showadmin() {
		return "AdminHome";
	}

	@RequestMapping("/UserHome")
	public String showuser() {
		return "UserHome";
	}

	@RequestMapping("/login")
	public String showLoginPage() {
		return "Login";
	}

	@RequestMapping("/perform_logout")
	public String showLogout() {
		return "Home";
	}

	@RequestMapping("/Home")
	public String showindex() {
		return "Home";
	}

	@RequestMapping("/")
	public String startup() {
		return "Home";
	}

	@RequestMapping("/Header")
	public String showhead() {
		return "Header";
	}

	@RequestMapping("/Feedback")
	public String showfeedback() {
		return "Feedback";
	}

	@RequestMapping("/FeedbackAfter")
	public String showfeedbackafter() {
		return "FeedbackAfter";
	}

	@RequestMapping("/AboutUs")
	public String showAboutUs() {
		return "AboutUs";
	}

	@RequestMapping("/HeaderUser")
	public String showHeaderUser() {
		return "HeaderUser";
	}

	@RequestMapping("/ContactUs")
	public String showContact() {
		return "ContactUs";
	}
	
	@RequestMapping("/Register")
	public String showregister() {
		return "Register";
	}

}