package com.amdocs.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amdocs.training.model.Contact;
import com.amdocs.training.repository.ContactRepository;

@Controller
public class ContactController {
	
	@Autowired
	private ContactRepository repository;
	
	@RequestMapping("/contact")
	public String getContactForm(Model model) {
		model.addAttribute("command", new Contact());
		return "contact";
	}
	
	@PostMapping("/sendmessage")
	public String sendMessagge(@ModelAttribute("contact") Contact contact) {
		repository.save(contact);
		return "redirect:/home";
	}
}
