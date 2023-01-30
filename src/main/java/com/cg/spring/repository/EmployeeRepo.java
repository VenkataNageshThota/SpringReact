package com.cg.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.spring.domain.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
