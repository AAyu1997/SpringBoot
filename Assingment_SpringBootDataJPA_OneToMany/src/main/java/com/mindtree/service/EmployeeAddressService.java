package com.mindtree.service;

import java.util.List;

import com.mindtree.bean.Employee;

public interface EmployeeAddressService {

	public Employee addEmployee(Employee employee);

	public Iterable<Employee> getEmployees();
	
	public Employee getEmployee(int employeeId);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(int employeeId);

	public List<Employee> getAllEmployeesByAddressId(int addressId);


	

	

	
}
