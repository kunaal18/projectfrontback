package com.te.springdto.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity

public class StudentEducationInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int eduId;
	private String board;
	private String highSchool;
	private String marks;
	private String yop;
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonBackReference
	private StudentPrimaryInfo primaryInfo;
}
