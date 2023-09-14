package com.example.courseservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.courseservice.intercomm.StudentClient;
import com.example.courseservice.model.Course;
import com.example.courseservice.model.Student;
import com.example.courseservice.repository.CourseRepository;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	CourseRepository repository;
	
	@Autowired
	StudentClient studClient;
	
	@GetMapping("/view")
	public List<Course> getCourses(){
		
		return repository.findAll();
		
	}

	@GetMapping("/service/stud/{studId}")
	public Student getStud(@PathVariable int studId) {
		return studClient.getStudent(studId);
	}
}
