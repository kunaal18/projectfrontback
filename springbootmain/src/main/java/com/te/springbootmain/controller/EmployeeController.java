package com.te.springbootmain.controller;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springbootmain.dto.EmployeeDto;
import com.te.springbootmain.entity.Employee;
import com.te.springbootmain.service.EmployeeService;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody EmployeeDto dto) {
		if (service.register(dto) != null) {
			return new ResponseEntity<EmployeeDto>(HttpStatus.OK);
		}
		return new ResponseEntity<String>("something went wrong", HttpStatus.BAD_REQUEST);

	}

//	s
//
//	@GetMapping("/login")
//	public ResponseEntity<?> login(EmployeeDto dto) {
//		if (service.getLogin(dto) != null) {
//
//		}
//	}
}
