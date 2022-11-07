package com.te.springbootmain.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data

public class Employee {
	@Id
	private int empId;
	private String empName;
	private String empAge;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	@JsonManagedReference
	private EmployeeSecondary employeeSecondaryInfo;  //non primitive property

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	@JsonManagedReference
	private List<EmployeeEducation> educationInfo;
}
