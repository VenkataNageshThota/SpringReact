package com.cg.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.domain.Employee;
import com.cg.spring.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo repo;

	@Override
	public Employee save(Employee emp) {
		return repo.save(emp);
	}

	@Override
	public Employee get(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Employee> getempdata() {
		return repo.findAll();
	}
	
	

}
