package com.mindtree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mindtree.bean.Employee;
import com.mindtree.service.EmployeeAddressService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeAddressService employeeAddressService;

	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		return this.employeeAddressService.addEmployee(employee);
		
	}
	
	
	@GetMapping("/employees")
	public Iterable<Employee> getEmployees() {
		
		Iterable<Employee> employees=null;
		
		employees=employeeAddressService.getEmployees();
		
		return employees;
		
	}
	
	
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable String employeeId) {
		
		return this.employeeAddressService.getEmployee(Integer.parseInt(employeeId));
	}
	
	
	@PutMapping("/employees/{employeeId}")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		return this.employeeAddressService.updateEmployee(employee);
	}
	
	
	@DeleteMapping("/employees/{employeeId}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable String employeeId) {
		
		try {
			
			 this.employeeAddressService.deleteEmployee(Integer.parseInt(employeeId));
			 return new ResponseEntity<>(HttpStatus.OK);
		} 
		catch (Exception e) {
			
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}

	}
	
}




