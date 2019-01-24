package com.diduslabs.gymtool;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping("/hello")
	public String Hello() {
		return "hello.html";
	}
	
	@GetMapping("/hello-mustache")
	public String HelloTemplates(Model model) {
		model.addAttribute("name","Pedro");
		return "hello-templates";
	}
}
