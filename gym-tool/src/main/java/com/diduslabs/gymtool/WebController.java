package com.diduslabs.gymtool;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping("/register")
	public String Hello() {
		return "register.html";
	}
	
	@GetMapping("/hello-mustache")
	public String HelloTemplates(Model model) {
		model.addAttribute("name","Pedro");
		return "hello-templates";
	}
}
