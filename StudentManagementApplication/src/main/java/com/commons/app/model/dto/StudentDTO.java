package com.commons.app.model.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.commons.app.enums.Gender;
import com.commons.app.model.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {

//	private Integer studentId;
//	private String name;
//	private LocalDate dob;
//	private Gender gender;
//	private String unique_student_code;
//	private String fathersFullName;
//	private String email;
//	private String mobileNumber;
	
	private Integer studentId;
	private String name;
	private String fatherName;
	private String email;
	private String mobileNumber;
	private LocalDate dob;
	private Gender gender;
	private String unique_student_code;
	
	private List<Address> address = new ArrayList<>();
	
}
