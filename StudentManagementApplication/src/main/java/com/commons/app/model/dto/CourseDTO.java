package com.commons.app.model.dto;

import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO {

	private Integer courseId;
	private String courseName;
	private String description;
	private String courseType;
	private String duration;
	private String topics;
	
}
