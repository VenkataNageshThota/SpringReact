package com.cg.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.spring.domain.Employee;
import com.cg.spring.repository.EmployeeRepo;

@SpringBootApplication
public class SpringReactApplication {
	
	@Autowired
	EmployeeRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringReactApplication.class, args);
	}
	
	@Bean
	public void savedata()
	{
			Employee emp = new Employee();
			emp.setEmployeeId(123);
			emp.setName("nag");
			emp.setSalary("1000");
			Employee emp1 = new Employee();
			emp1.setEmployeeId(456);
			emp1.setName("abc");
			emp1.setSalary("2000");
			Employee emp2 = new Employee();
			emp2.setEmployeeId(789);
			emp2.setName("xyz");
			emp2.setSalary("3000");
			List<Employee> list = new ArrayList<>();
			list.add(emp);
			list.add(emp1);
			list.add(emp2);
			repo.saveAll(list);
	}

}
