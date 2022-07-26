package com.boot.restapi.services;

import java.util.List;

import com.boot.restapi.enteties.Course;

public interface CourseService {


	public List<Course>getCourses();
	
	public Course getCourse(long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);
	
	public void deleteCourse (long parseLong);
}
