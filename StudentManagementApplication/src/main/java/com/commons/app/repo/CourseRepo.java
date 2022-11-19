package com.commons.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commons.app.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {
	
}
