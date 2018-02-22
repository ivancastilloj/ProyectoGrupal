package com.boraji.tutorial.spring.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyContoller {

	 @GetMapping("/")
	  public String index(Model model, Principal principal) {
	    model.addAttribute("message", "You are logged in as " + principal.getName());
	    return "index";
	  }
	 @PostMapping("/carrito")
	  public String carrito(Model model, Principal principal) {
	    model.addAttribute("message", "You are logged in as " + principal.getName());
	    return "carrito";
	  }
}
