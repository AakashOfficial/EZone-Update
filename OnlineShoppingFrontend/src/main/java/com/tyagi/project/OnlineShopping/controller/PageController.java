package com.tyagi.project.OnlineShopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

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

}
