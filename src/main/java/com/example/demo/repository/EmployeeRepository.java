package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.dto.Employee;
import com.example.demo.dto.EmployeeIdentity;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeeIdentity> {
	Optional<Employee> findById(EmployeeIdentity employeeIdentity);
	List<Employee> findByEmployeeIdentityCompanyId(String companyId);
	List<Employee> findByEmployeeIdentityEmployeeId(String employeeId);
}
