package com.te.springbootmain.dto;

import java.util.List;

import com.te.springbootmain.entity.EmployeeEducation;

import lombok.Data;
@Data
public class ReturnEmployee {
private String empId;
private String empName;
private String empEmail;
private List<EmployeeEducation> eduInfo;

}
