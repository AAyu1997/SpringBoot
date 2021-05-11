package com.mindtree.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindtree.bean.Employee;
import com.mindtree.repository.AddressRepository;
import com.mindtree.repository.EmployeeRepository;


@Service
public class EmployeeAddressServiceImpl implements EmployeeAddressService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	private AddressRepository addressRepository;

	
	@Override
	public Employee addEmployee(Employee employee) {
		
		addressRepository.save(employee.getAddress());
		
		employeeRepository.save(employee);
		
		return employee;
	}
	
	@Override
	public Iterable<Employee> getEmployees() {
		
		return employeeRepository.findAll();
		
	}


	@Override
	public Employee getEmployee(int employeeId) {
		
		return employeeRepository.findById(employeeId).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
	
		employeeRepository.save(employee);
		
		return employee;
	}

	@Override
	public void deleteEmployee(int employeeId) {
		
		Employee employee=employeeRepository.getOne(employeeId);
		
		employeeRepository.delete(employee);
	}

	@Override
	public List<Employee> getAllEmployeesByAddressId(int addressId) {
		
		return null;
		
	}

}



