package com.te.springdto.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Data

public class StudentPrimaryInfo {
	@Id
	private String stuId;
	private String stuName;
	private String stuRollNo;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "primaryInfo")
	@JsonManagedReference
	private StudentSecondaryInfo secondaryInfo;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "primaryInfo")
	@JsonManagedReference
	private List<StudentEducationInfo> educationInfo;
}
