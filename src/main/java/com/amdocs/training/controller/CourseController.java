package com.amdocs.training.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amdocs.training.model.Course;
import com.amdocs.training.repository.CourseRepository;

@Controller
public class CourseController {

	@Autowired
	private CourseRepository repository;
	
	@RequestMapping("/courses")
	public String getCourses(Model model) {
		model.addAttribute("courses", repository.findAll());
		return "courses";
	}
	
	@RequestMapping("/courses/newcourse") 
	public String addNewCourse(Model model) {
		model.addAttribute("command", new Course());
		return "addcourse";
	}
	
	@PostMapping("/courses/add")
	public String createCourse(@ModelAttribute("course") Course course) {
		repository.save(course);
		return "redirect:/courses";
	}
	
	@RequestMapping("/updatecourse/{id}")
	public String updateCourseForm(@PathVariable long id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("command", repository.findById(id).orElse(null));
		return "updatecourse";
	}
	
	@PostMapping("/courses/update/{id}")
	public String updateCourse(@PathVariable long id, @ModelAttribute("course") Course course) {
		Course _course = repository.findById(id).orElse(null);
		_course.setName(course.getName());
		_course.setDescription(course.getDescription());
		_course.setFee(course.getFee());
		_course.setResource(course.getResource());
		
		repository.save(_course);
		return "redirect:/courses";
	}
	
	@RequestMapping("/deletecourse/{id}")
	public String deleteCourse(@PathVariable long id) {
		repository.deleteById(id);
		return "redirect:/courses";
	}
}
