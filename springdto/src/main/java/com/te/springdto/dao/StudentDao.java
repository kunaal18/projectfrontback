package com.te.springdto.dao;

import org.springframework.data.repository.CrudRepository;

import com.te.springdto.entity.StudentPrimaryInfo;

public interface StudentDao extends CrudRepository<StudentPrimaryInfo, String> {

}
