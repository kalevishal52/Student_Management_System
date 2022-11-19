package com.commons.app.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.commons.app.enums.AddressType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
	
	@Id
	private Integer courseId;
	private String courseName;
	private String description;
	private String courseType;
	private LocalTime durationTime;
	private String topics;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<Student> students = new ArrayList<>();
}

