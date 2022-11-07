package com.te.springdto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.springdto.dto.StudentP;
import com.te.springdto.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody StudentP dto) {
		try {
			service.register(dto);
			return new ResponseEntity<String>("Successfully registered", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Something went wrong", HttpStatus.BAD_REQUEST);
	}
}