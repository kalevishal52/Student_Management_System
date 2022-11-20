package com.commons.app.model.dto;

import java.time.LocalDate;

import com.commons.app.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentUpdateDTO {

	private Integer studentId;
	private LocalDate dob;
	private String newEmail;
	private String newMobileNumber;
	
	
}
