package com.example.security3app.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "(security3app) spring boot app with spring security. the goal is to implement the ";
	}
	
	@PreAuthorize("hasRole('USER')")
	@RequestMapping("/user")
	@ResponseBody
	public String userPage() {
		return "Hello, User";
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping("/admin")
	@ResponseBody
	public String adminPage() {
		return "Hello, Admin";
	}
}
