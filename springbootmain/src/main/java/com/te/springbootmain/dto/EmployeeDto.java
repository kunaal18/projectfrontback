package com.te.springbootmain.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.te.springbootmain.entity.EmployeeEducation;
import com.te.springbootmain.entity.EmployeeSecondary;

import lombok.Data;

@Data
public class EmployeeDto {
	private String empId;
	private String pan;
	@JsonManagedReference
	private EmployeeSecondary employeeSecondaryInfo;
	@JsonBackReference
	private List<EmployeeEducation> educationInfo;

}
