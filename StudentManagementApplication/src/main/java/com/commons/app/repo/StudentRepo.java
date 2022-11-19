package com.commons.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commons.app.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
