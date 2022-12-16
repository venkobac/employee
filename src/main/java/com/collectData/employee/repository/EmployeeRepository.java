package com.collectData.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collectData.employee.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	default public Employee savePerson(Employee employee) {
		return save(employee);
	}

	default public Employee getEmployee(int empId) {
		return findById(empId).get();
	}

	default public Employee deleteEmployee(int empId) {
		return null;
	}

}
