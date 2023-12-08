package com.apachePOI.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apachePOI.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {
	
	
	
	
}
