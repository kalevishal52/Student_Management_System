package com.commons.app.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.commons.app.enums.AddressType;
import com.commons.app.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studentId;
	private String name;
	private String fathersFullName;
	private String email;
	private String mobileNumber;
	private LocalDate dob;
	private Gender gender;
	private String unique_student_code;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> address = new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "students")
	List<Course> courses = new ArrayList<>();

	@Override
	public String toString() {
		return "Student [name=" + name + ", fathersFullName=" + fathersFullName + ", email=" + email + ", mobileNumber="
				+ mobileNumber + ", dob=" + dob + ", gender=" + gender + ", unique_student_code=" + unique_student_code
				+ ", address=" + address + "]";
	}

	
	
	
	
}
