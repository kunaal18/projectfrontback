package com.te.springbootmain.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
@Table
public class EmployeeEducation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int eduId;

	private String qualification;
	private String yop;
	private int marks;
	private String university;
	private String institute;
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonBackReference
	private Employee employeePrimaryInfo;
}
