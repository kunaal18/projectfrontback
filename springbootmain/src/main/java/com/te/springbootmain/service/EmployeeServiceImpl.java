package com.te.springbootmain.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;

import com.te.springbootmain.dao.EmployeeDao;
import com.te.springbootmain.dto.EmployeeDto;
import com.te.springbootmain.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;
	@Autowired
	private ModelMapper mapper;

	@Override
	public Employee register(EmployeeDto dto) {
		Employee register = this.mapper.map(dto, Employee.class);

		return register;
	}

//	@Override
//	public Employee update(Employee employee) {
//		return dao.save(employee);
//	}

	@Override
	public Employee getLogin(EmployeeDto dto) {
		return null;
	}

	// public dtoToEntity(model)
}