package com.itgenius.service.department.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.itgenius.service.employee.model.Employee;

import lombok.Data;

@Data
@Document(collection = "department")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Department {
    private String id;
    private String name;
    private String organizationId;
    private List<Employee> employees;
}