package com.amdocs.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amdocs.training.model.User;
import com.amdocs.training.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping("/register")
	public String showRegister(Model model) {
		model.addAttribute("command", new User());
		return "register";
	}
	
	@PostMapping("/register/newuser")
	public String createUser(@ModelAttribute("user") User user ) {
		userRepo.save(user);
		return "redirect:/home";
	}
	
}
