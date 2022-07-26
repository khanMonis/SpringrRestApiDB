package com.boot.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.restapi.enteties.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
