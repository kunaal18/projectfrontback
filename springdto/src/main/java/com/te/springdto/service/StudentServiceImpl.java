package com.te.springdto.service;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springdto.dao.StudentDao;
import com.te.springdto.dto.StudentP;
import com.te.springdto.entity.StudentPrimaryInfo;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao dao;


  private ModelMapper modelMapper=new ModelMapper();

	@Override
	public void register(StudentP dto) {
		StudentPrimaryInfo result = modelMapper.map(dto, StudentPrimaryInfo.class);
		dao.save(result);
	}

}
