package com.te.springbootmain.dao;

import org.springframework.data.repository.CrudRepository;

import com.te.springbootmain.dto.EmployeeDto;
import com.te.springbootmain.entity.Employee;

public interface EmployeeDao extends CrudRepository<EmployeeDto, String> {
	public Employee findByEmpId(String empId);
}
