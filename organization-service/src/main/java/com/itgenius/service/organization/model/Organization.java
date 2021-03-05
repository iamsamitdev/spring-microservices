package com.itgenius.service.organization.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.itgenius.service.department.model.Department;
import com.itgenius.service.employee.model.Employee;

import lombok.Data;

@Data
@Document(collection = "organization")

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Organization {
    @Id
    private String id;
    private String name;
    private String address;
    private List<Department> departments;
    private List<Employee> employees;
}