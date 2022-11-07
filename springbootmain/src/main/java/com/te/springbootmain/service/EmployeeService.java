package com.te.springbootmain.service;

import java.util.List;

import com.te.springbootmain.dto.EmployeeDto;
import com.te.springbootmain.entity.Employee;

public interface EmployeeService {

	public Employee register(EmployeeDto dto);

	// public Employee update(Employee employee);

	public Employee getLogin(EmployeeDto dto);

	// public List<EmployeeDataReturn> getAll();

	// public List<ReturnEmployee> getOne(String empId);
}
