package com.itgenius.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itgenius.service.model.Employee;
import com.itgenius.service.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> findAllEmployee() {
        return this.employeeRepository.findAll();
    }

    public Employee findEmployeeById(String id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee addNewEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployeeById(String id) {
        employeeRepository.deleteById(id);
    }

    public Employee updateEmployeeById(String id, Employee employee) {
    	employeeRepository.findById(id).ifPresent(e -> employee.setId(e.getId()));
        return employeeRepository.save(employee);
    }

    public List<Employee> findEmployeeByDepartmentId(String departmentId) {
        return employeeRepository.findByDepartmentId(departmentId);
    }

    public List<Employee> findEmployeeByOrganizationId(String organizationId) {
        return employeeRepository.findByOrganizationId(organizationId);
    }

}
