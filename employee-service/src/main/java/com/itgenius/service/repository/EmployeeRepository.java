package com.itgenius.service.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itgenius.service.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
	List<Employee> findByDepartmentId(String departmentId);
    List<Employee> findByOrganizationId(String organizationId);
}
