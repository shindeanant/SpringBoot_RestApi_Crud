package com.restapi.springbootrestapicrud.serviceinterface;

import com.restapi.springbootrestapicrud.model.Employee;

import java.util.List;

public interface EmployeeInterface {
    public void saveEmp(Employee employee);
    public Employee updateEmp(Employee employee);
    public void deleteEmp(int id);
    public List<Employee> getAllEmp();
}
