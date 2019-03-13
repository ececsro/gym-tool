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
	
	@GetMapping("/routineList")
	public String HelloTemplates(Model model) {
		List<Item> listAnything = new ArrayList<Item>();
		listAnything.add(new Item("caca","323232",true));
		listAnything.add(new Item("Pepe","2",false));
		
		List<Item> listAvailable = new ArrayList<Item>();
		listAvailable.add(new Item("caca","323232",true));
		listAvailable.add(new Item("Pepe","2",false));
		
		
		model.addAttribute("routine",listAvailable);
		model.addAttribute("routineNotAvailable",listAnything);
		return "routineList";
	}
}
