package com.collectData.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.collectData.employee.entity.Employee;
import com.collectData.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmloyee(employee);
	}
	@GetMapping("/get")
	public Employee getEmployee(@RequestParam int empId) {
		return employeeService.getEmployee(empId);
	}
	@DeleteMapping("/delete")
	public Employee deleteEmployee(@RequestParam int empId) {
		return employeeService.deleteEmployee(empId);
	}
	
}