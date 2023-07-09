package io.github.nishadchayanakhawa.intellidash.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntelliDashApplicationControllers {
	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}
	
	@GetMapping("/home")
	public String getHomePage() {
		return "home";
	}
	
	@GetMapping("/setting/usermanagement")
	public String getUserManagementPage() {
		return "setting/userManagement";
	}
}
