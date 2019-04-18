package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Employee;
import com.example.demo.dto.EmployeeIdentity;
import com.example.demo.repository.EmployeeRepository;

@RestController
public class CompositeKeyController {
	@Autowired
	EmployeeRepository employeeRepository;
	
	/**
	 * 
	 * @return
	 */
	@PostMapping(value = "/getEmployeeListById")
	@ResponseBody
	public Optional<Employee> getEmployeeListById(@RequestParam int userID) {
		 System.out.println("Request Id is---->"+userID);
		 Optional<Employee> employees = employeeRepository.findById(new EmployeeIdentity("E-120","D-458"));
         return employees;
	}
	
	/**
	 * 
	 * @return
	 */
	@PostMapping(value = "/getEmployeeListByCompanyId")
	@ResponseBody
	public List<Employee> getEmployeeListByCompanyId(@RequestParam String companyID) {
		 System.out.println("Request Id is---->"+companyID);
		 List<Employee> employees = employeeRepository.findByEmployeeIdentityCompanyId(companyID);
         return employees;
	}
	
	
	/**
	 * 
	 * @return
	 */
	@PostMapping(value = "/getEmployeeListByEmployeeId")
	@ResponseBody
	public List<Employee> getEmployeeListByEmployeeId(@RequestParam String employeeID) {
		 System.out.println("Request Id is---->"+employeeID);
		 List<Employee> employees = employeeRepository.findByEmployeeIdentityEmployeeId(employeeID);
         return employees;
	}
	
}
