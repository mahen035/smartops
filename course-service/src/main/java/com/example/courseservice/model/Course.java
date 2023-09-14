package com.example.courseservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	private String courseName;
	private double courseFees;
	private int couseDuration;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}
	public int getCouseDuration() {
		return couseDuration;
	}
	public void setCouseDuration(int couseDuration) {
		this.couseDuration = couseDuration;
	}
	

}

