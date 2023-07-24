package com.railworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class railworldcontroller {
	@RequestMapping("/railworld")
	public String railworldform() {
		
		return "home_page";
	}
	
	@RequestMapping("/hr")
	public String HR() {
		return "hr_login";
	}
	
	
	@RequestMapping("/admin")
	public String Admin() {
		return "admin_login";
	}
	
	@RequestMapping("/projectmanager")
	public String ProjectManager() {
		return "projectmanager_login";
	}


}
