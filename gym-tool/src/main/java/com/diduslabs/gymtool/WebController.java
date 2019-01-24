package com.diduslabs.gymtool;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	
	@GetMapping("/hello") 
	public String helloWorld () {
		return "hello-world.html";
	}
	
	@GetMapping("/hello-templates")
	public String helloTemplate(Model model) {
		model.addAttribute("name","Pepe");
		return "hello-moustache";
	}
}
