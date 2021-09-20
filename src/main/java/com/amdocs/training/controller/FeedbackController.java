package com.amdocs.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amdocs.training.model.Feedback;
import com.amdocs.training.repository.FeedbackRepository;

@Controller
public class FeedbackController {
	
	@Autowired
	private FeedbackRepository repository;
	
	@RequestMapping("/feedback")
	public String showFeedback(Model model) {
		model.addAttribute("feedbacks", repository.findAll());
		return "feedback";
	}
	
	@RequestMapping("/feedback/addfeedback")
	public String addFeedback(Model model) {
		model.addAttribute("command", new Feedback());
		return "addfeedback";
	}
	
	@PostMapping("/feedback/add")
	public String sendFeedback(@ModelAttribute("feedback") Feedback feedback) {
		repository.save(feedback);
		return "redirect:/feedback";
	}
	
	@RequestMapping("/updatefeedback/{id}")
	public String updateFeedbackForm(@PathVariable long id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("command", repository.findById(id).orElse(null));
		return "updatefeedback";
	}
	
	@PostMapping("/feedback/update/{id}")
	public String updateFeedback(@PathVariable long id, @ModelAttribute("feedback") Feedback feedback) {
		Feedback _feed = repository.findById(id).orElse(null);
		_feed.setName(feedback.getName());
		_feed.setEmail(feedback.getEmail());
		_feed.setUserId(feedback.getUserId());
		_feed.setFeed(feedback.getFeed());
		
		repository.save(_feed);
		return "redirect:/feedback";
	}
	
	@RequestMapping("/deletefeedback/{id}")
	public String deleteFeedback(@PathVariable long id) {
		repository.deleteById(id);
		return "redirect:/feedback";
	}
}
