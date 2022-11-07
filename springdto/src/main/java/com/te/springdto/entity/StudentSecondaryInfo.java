package com.te.springdto.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
public class StudentSecondaryInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String pan;
	private String aadhar;
	private String dob;
	private String height;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonBackReference
	private StudentPrimaryInfo primaryInfo;
}
