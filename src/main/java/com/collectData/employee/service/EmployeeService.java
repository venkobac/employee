package com.collectData.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collectData.employee.entity.Employee;
import com.collectData.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public Employee saveEmloyee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee getEmployee(int empId) {
		return employeeRepository.getEmployee(empId);
	}

	public Employee deleteEmployee(int empId) {
		return employeeRepository.deleteEmployee(empId);
	}
	
}
