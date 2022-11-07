package com.te.springbootmain.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Data
@Table(name="EmployeeSecondaryInfo")
public class EmployeeSecondary {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String pan;
	private String height;
	private String passport;
	private String doj;
	@OneToOne(cascade= CascadeType.ALL)
	@JsonBackReference
	private Employee employeePrimaryInfo;



}