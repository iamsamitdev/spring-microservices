package com.itgenius.service.department.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.itgenius.service.employee.model.Employee;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "department")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Department {
    private String id;
    private String name;
    private String organizationId;
    private List<Employee> employees;
}