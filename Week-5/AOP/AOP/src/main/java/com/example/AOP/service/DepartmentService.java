package com.example.AOP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AOP.annotation.CustomAnnotation;
import com.example.AOP.model.Department;
import com.example.AOP.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department save(Department department) {
		return departmentRepository.save(department);
	}

	@CustomAnnotation
	public Department findById(Integer id) {
		return departmentRepository.findById(id).orElseThrow();
	}

}
