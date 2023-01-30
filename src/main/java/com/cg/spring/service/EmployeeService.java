package com.cg.spring.service;

import java.util.List;

import com.cg.spring.domain.Employee;

public interface EmployeeService {

	Employee save(Employee emp);

	Employee get(Integer id);

	List<Employee> getempdata();

}
