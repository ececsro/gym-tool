package com.diduslabs.gymtool;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping("/logIn")
	public String Hello() {
		return "logIn.html";
	}
	
	@GetMapping("/register")
	public String Hello2() {
		return "register.html";
	}
	
	@GetMapping("/dashboard")
	public String HelloTemplates(Model model) {
		List<Item> listAnything = new ArrayList<Item>();
		listAnything.add(new Item("caca","323232"));
		listAnything.add(new Item("Pepe","2"));
		
		model.addAttribute("isEmptyFavRoutine",listAnything.isEmpty());
		model.addAttribute("isEmptyClass",listAnything.isEmpty());
		
		model.addAttribute("routine",listAnything);
		model.addAttribute("class",listAnything);
		return "dashboard";
	}
}
