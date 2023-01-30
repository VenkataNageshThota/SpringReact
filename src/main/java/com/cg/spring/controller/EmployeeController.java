package com.cg.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.domain.Employee;
import com.cg.spring.service.EmployeeService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class EmployeeController {
	

	@Autowired
	EmployeeService service;
	
	@PostMapping("save")
	public Employee save(@RequestBody Employee emp)
	{
		System.out.println(emp);
		return service.save(emp);
	}
	
	@GetMapping("get/{id}")
	public Employee get(@PathVariable("id") Integer id)
	{
		return service.get(id);
	}
	
	@GetMapping("getEmployees")
	public List<Employee> getempdata()
	{
		return service.getempdata();
	}

}
