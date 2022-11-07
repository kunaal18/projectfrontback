package com.te.springdto.dto;

import java.util.List;

import com.te.springdto.entity.StudentEducationInfo;
import com.te.springdto.entity.StudentSecondaryInfo;

import lombok.Data;

@Data
public class StudentP {

	private String stuId;
	private String stuName;
	private String stuRollNo;

	private StudentSecondaryInfo secondaryInfo;
	private List<StudentEducationInfo> educationInfo;
}
