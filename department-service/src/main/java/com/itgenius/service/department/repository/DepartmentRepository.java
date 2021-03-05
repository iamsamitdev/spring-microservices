package com.itgenius.service.department.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itgenius.service.department.model.Department;

import java.util.List;

public interface DepartmentRepository extends MongoRepository<Department, String> {
    List<Department> findByOrganizationId(String organizationId);
}